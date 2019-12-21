package com.springwebflux.bootcamp.service.personal.app.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import com.springwebflux.bootcamp.service.personal.app.services.PersonalServicesImplement;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@RestController
@RequestMapping("api")
public class RestControllerPersonal {
	
@Autowired
	   PersonalServicesImplement implement;

@GetMapping("/getPersonal") 
	   Flux<Personal>getPersonal()
	   {
	   return implement.getPersonal();
	   }	

@PostMapping("/createPersonal")
	 	Mono<Personal> CreatePersonal(@RequestBody Personal personal){		
	 		return implement.createPersonal(personal);	
	 	}
	 	
	 @DeleteMapping("/deletePersonal/{id}")
	 	Mono<Void> deletePersonal(@PathVariable String id){		
	 		return implement.deletePersonal(id)	;
	 	}
	 	
	 @PutMapping("/updatePersonal")
	 	Mono<Personal> updatePersonal(@RequestBody Personal personal){		
	 		return implement.updatePersonal(personal);		
	 	}

	 @GetMapping("/getPersonalNro/{nro}")
	 	Mono<Personal>getPersonalNrodoc(@PathVariable String nro){		
	 		return implement.getPersonalNrodoc(nro);	
	 	}
	 	
	 @GetMapping("/txt")
	 	public String txt(){		
	 	return "Bienvenido Entidad Personal";	
	 	}
}
