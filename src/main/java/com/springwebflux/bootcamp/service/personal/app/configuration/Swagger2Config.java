package com.springwebflux.bootcamp.service.personal.app.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
@Configuration
@EnableSwagger2WebFlux
public class Swagger2Config {

	@Bean
	 public Docket api() {
	    return new Docket(DocumentationType.SWAGGER_2)
	            .apiInfo(apiInfo())
	            .enable(true)
	            .select()
	            .paths(PathSelectors.ant("/api/personal/**"))
	            .build();
	  }
	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	    		.title("Reactive Streams Starter Demo")
	    		.description("Reactive Streams Starter Demo")
	    		.version("2.0")
	    		.build();
	  }
}
