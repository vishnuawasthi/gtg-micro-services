package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableHystrix
@SpringBootApplication
public class GtgPhase2MemberServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtgPhase2MemberServicesApplication.class, args);
	}

}
