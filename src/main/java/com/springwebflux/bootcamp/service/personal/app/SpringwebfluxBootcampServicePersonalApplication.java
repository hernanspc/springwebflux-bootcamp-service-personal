package com.springwebflux.bootcamp.service.personal.app;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringwebfluxBootcampServicePersonalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringwebfluxBootcampServicePersonalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}
	
}
