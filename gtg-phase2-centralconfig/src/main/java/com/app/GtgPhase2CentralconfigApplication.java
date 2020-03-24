package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GtgPhase2CentralconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtgPhase2CentralconfigApplication.class, args);
	}

}
