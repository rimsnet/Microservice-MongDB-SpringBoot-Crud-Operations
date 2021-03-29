package com.rimsan.springboot.mongodb.crud.applications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@EnableMongoRepositories(basePackages="com.rimsan.springboot.mongodb.crud.repo")
@ComponentScan(value="com.rimsan.springboot.mongodb.crud.*")
@SpringBootApplication
public class SBMongDbCRUDOperationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SBMongDbCRUDOperationsApplication.class, args);
	}
	@Bean
    public Docket swaggerApi() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.rimsan.springboot.mongodb.crud.controller"))
                .build();
    }

}
