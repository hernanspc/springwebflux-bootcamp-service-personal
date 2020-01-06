package com.springwebflux.bootcamp.service.personal.app.services;
import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
public interface IpersonalServices {

	Flux<Personal>getPersonal();
	Mono<Personal>createPersonal(Personal personal);
	Mono<Void>deletePersonal(String Id);
	Mono<Personal>updatePersonal(Personal personal);
	Mono<Personal>getPersonalNrodoc(String nrodoc);
}
