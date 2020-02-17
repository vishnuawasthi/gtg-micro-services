package com.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@Value("${appication.greetings}")

	private String greetings;

	@GetMapping("/greet")
	public Object greet() {
		return new ResponseEntity<String>(greetings, HttpStatus.OK);
	}

}
