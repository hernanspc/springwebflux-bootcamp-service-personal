package com.springwebflux.bootcamp.service.personal.app.services;
import java.util.Date;

import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface IpersonalServices {

	public Flux<Personal> findAll();
	public Mono<Personal> findById(String id);
	Flux<Personal> findByName(String name);
	Mono<Personal> findByNumDoc(String numDoc);
	public Mono<Personal> save(Personal personal);
	Mono<Personal> update(Personal personal);
	public Mono<Void> delete(Personal personal);
	
}
