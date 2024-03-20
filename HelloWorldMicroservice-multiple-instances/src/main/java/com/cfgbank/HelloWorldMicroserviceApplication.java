package com.cfgbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
// If you don't use this annotation, then this microservie
// will not be discovered from Eureka
public class HelloWorldMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldMicroserviceApplication.class, args);
		System.out.println("Hello World Microservice Multiple instance started....");
	}
}