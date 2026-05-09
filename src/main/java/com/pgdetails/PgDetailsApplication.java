package com.pgdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PgDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PgDetailsApplication.class, args);
	}

}
