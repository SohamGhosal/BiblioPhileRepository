package com.bibliophile.biblioconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
@EnableCircuitBreaker
public class BiblioConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BiblioConfigServerApplication.class, args);
	}

}
