package com.springwebflux.bootcamp.service.personal.app.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import com.springwebflux.bootcamp.service.personal.app.repository.IpersonalRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;;
@Service
public class PersonalServicesImplement implements IpersonalServices {

	@Autowired
	IpersonalRepository repositorio;

	private static final Logger LOG =
	          LoggerFactory.getLogger(PersonalServicesImplement.class);
	
	@Override
	public Flux<Personal> findAll() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Mono<Personal> findById(String id) {
		// TODO Auto-generated method stub
		return repositorio.findById(id);
	}

	@Override
	public Flux<Personal> findByName(String name) {
		// TODO Auto-generated method stub
		return repositorio.findByname(name);
	}

	@Override
	public Mono<Personal> findByNumDoc(String numDoc) {
		// TODO Auto-generated method stub
		return repositorio.findBynumDoc(numDoc);
	}

	@Override
	public Mono<Personal> save(Personal personal) {
		// TODO Auto-generated method stub
		LOG.info(personal.toString());
		return repositorio.save(personal);
	}

	@Override
	public Mono<Personal> update(Personal personal) {
		// TODO Auto-generated method stub
		return repositorio.save(personal);
	}

	@Override
	public Mono<Void> delete(Personal personal) {
		// TODO Auto-generated method stub
		return repositorio.delete(personal);
	}

	 
	
}
	

	