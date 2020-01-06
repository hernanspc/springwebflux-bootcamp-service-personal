package com.springwebflux.bootcamp.service.personal.app.repository;
import java.util.Date;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import com.springwebflux.bootcamp.service.personal.app.model.Personal;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
@Repository
public interface IpersonalRepository extends ReactiveMongoRepository<Personal, String> {

	 
	Mono<Personal> findBynumDoc(String numDoc);
	Flux<Personal> findByname(String names);
     
}
