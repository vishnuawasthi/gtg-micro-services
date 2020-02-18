package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages="com.app.restclients")
@SpringBootApplication
public class GtgCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtgCurrencyConversionServiceApplication.class, args);
	}

}
