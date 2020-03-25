package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.app.repository")
@SpringBootApplication
public class GtgMemberServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtgMemberServicesApplication.class, args);
	}

}
