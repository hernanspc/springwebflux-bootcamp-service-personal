package com.springwebflux.bootcamp.service.personal.app.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.springwebflux.bootcamp.service.personal.app.model.Personal;

import reactor.core.publisher.Mono;
@Repository
public interface IpersonalRepository extends ReactiveMongoRepository<Personal, String> {

	Mono<Personal> findByNrodoc(String Nrodoc);
	
}
