package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients(basePackages="com.app.restclients")
@EnableDiscoveryClient
public class GtgCurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtgCurrencyConversionServiceApplication.class, args);
	}

}
