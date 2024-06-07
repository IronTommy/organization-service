package com.example.organization_service;

import org.springframework.boot.SpringApplication;

public class TestOrganizationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.from(OrganizationServiceApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
