package com.integration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/config/integration-context.xml")
public class SpringIntegrationSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntegrationSampleApplication.class, args);
	}
}
