package com.springwebflux.bootcamp.service.personal.app.controller;
import java.net.URI;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import com.springwebflux.bootcamp.service.personal.app.services.IpersonalServices;
import com.springwebflux.bootcamp.service.personal.app.services.PersonalServicesImplement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("/api/personal")
public class RestControllerPersonal {
	 
	   @Autowired
	   private IpersonalServices service;
	   
	   private static final Logger LOG = LoggerFactory.getLogger(RestControllerPersonal.class);
	   
	   @GetMapping
	   public Mono<ResponseEntity<Flux<Personal>>> findAll() {
	   return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(service.findAll()));
	   }
	   
	   @PostMapping("/createPersonal")
		public Mono<ResponseEntity<Personal>> create(@RequestBody Personal personal) {
			return service.save(personal).map(p -> ResponseEntity.created(URI.create("/api/personal/".concat(p.getId())))
					.contentType(MediaType.APPLICATION_JSON).body(p));
	   }
 
	   @GetMapping("/{id}")
		public Mono<ResponseEntity<Personal>> findAllBy(@PathVariable String id) {
			return service.findById(id).map(p -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(p))
					.defaultIfEmpty(ResponseEntity.notFound().build());
		}

		@GetMapping("/document/{numDoc}")
		public Mono<ResponseEntity<Personal>> findByDni(@PathVariable String numDoc) {
			return service.findByNumDoc(numDoc).map(p -> ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(p))
					.defaultIfEmpty(ResponseEntity.notFound().build());
		}

		@GetMapping("/names/{names}")
		public Mono<ResponseEntity<Flux<Personal>>> findByName(@PathVariable String names) {
			return Mono.just(ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(service.findByName(names)))
					.defaultIfEmpty(ResponseEntity.notFound().build());
		}

 
		@PutMapping("/{id}")
		public Mono<ResponseEntity<Personal>> update(@RequestBody Personal personal, @PathVariable String id) {
			return service.findById(id).flatMap(p -> { 
				p.setName(personal.getName());
				p.setTypeDoc(personal.getTypeDoc()); 
				p.setNumDoc(personal.getNumDoc()); 
				p.setCreateAt(new Date());
				p.setCountSavingList(personal.getCountSavingList());
				return service.save(p);
			}).map(p -> ResponseEntity.created(URI.create("/api/personal/".concat(p.getId())))
					.contentType(MediaType.APPLICATION_JSON).body(p)).defaultIfEmpty(ResponseEntity.notFound().build());
		}
		
		@DeleteMapping("/{id}")
		public Mono<ResponseEntity<Void>> delete(@PathVariable String id) {
			return service.findById(id).flatMap
					(p -> {return service.delete(p).then(Mono.just(new ResponseEntity<Void>(HttpStatus.NO_CONTENT)));})
					.defaultIfEmpty(new ResponseEntity<Void>(HttpStatus.NOT_FOUND));
		}

	   
	   
}
