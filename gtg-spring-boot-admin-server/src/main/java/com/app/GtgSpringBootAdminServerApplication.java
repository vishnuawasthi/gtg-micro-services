package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class GtgSpringBootAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtgSpringBootAdminServerApplication.class, args);
	}

}
