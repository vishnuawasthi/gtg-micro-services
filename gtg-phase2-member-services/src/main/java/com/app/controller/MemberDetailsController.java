package com.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.UserDetailsDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RefreshScope
@RestController
public class MemberDetailsController {

	@Value("${member.username}")
	private String username;

	@Value("${member.password}")
	private String password;

	// @Autowired
	// private UserDetailsDTO userDetails;

	@GetMapping(value = "/members", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getMemberDetails() {
		UserDetailsDTO userDetails = new UserDetailsDTO();
		userDetails.setUsername(username);
		userDetails.setPassword(password);
		return new ResponseEntity<UserDetailsDTO>(userDetails, HttpStatus.OK);
	}

	@HystrixCommand(fallbackMethod="getMemberDetailsByIdFallBack")  
	@GetMapping(value = "/members/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getMemberDetailsById(@PathVariable(name = "id") Long id) throws Exception {
		UserDetailsDTO userDetails = new UserDetailsDTO();
		userDetails.setUsername(username);
		userDetails.setPassword(password);

		if (id == Long.valueOf(100)) {
			throw new Exception("Unable to process");
		}

		return new ResponseEntity<UserDetailsDTO>(userDetails, HttpStatus.OK);
	}

	public Object getMemberDetailsByIdFallBack(Long id) {
		UserDetailsDTO userDetails = new UserDetailsDTO();
		System.out.println("ID : "+id);
		userDetails.setUsername(username + " - from fallBack");
		userDetails.setPassword(password + "- from fallBack");
		return new ResponseEntity<UserDetailsDTO>(userDetails, HttpStatus.OK);
	}

}
