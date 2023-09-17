package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages="com.demo.repo")
public class CustomQuerySpringBootRestApi5Application {

	public static void main(String[] args) {
		SpringApplication.run(CustomQuerySpringBootRestApi5Application.class, args);
	}

}
