package com.springwebflux.bootcamp.service.personal.app.services;
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

	@Override
	public Flux<Personal> getPersonal() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Mono<Personal> createPersonal(Personal personal) {
		// TODO Auto-generated method stub
		return repositorio.save(personal);
	}

	@Override
	public Mono<Void> deletePersonal(String Id) {
		// TODO Auto-generated method stub
		return repositorio.deleteById(Id);
	}

	@Override
	public Mono<Personal> updatePersonal(Personal personal) {
		// TODO Auto-generated method stub
		return repositorio.save(personal);
	}

	@Override
	public Mono<Personal> getPersonalNrodoc(String nrodoc) {
		// TODO Auto-generated method stub
		return repositorio.findByNrodoc(nrodoc);
	}

	
}
	

	