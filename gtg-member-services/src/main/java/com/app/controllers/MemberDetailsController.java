package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.UserDetails;
import com.app.repository.UserDetailsRepository;

//http://localhost:8088/api/v1/members
@RestController
@RequestMapping(value = "/api")
public class MemberDetailsController {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@GetMapping(value = "/v1/members/{id}")
	public Object getMemberDetailsById(@PathVariable(name = "id") Long id) {
		UserDetails userDetails = userDetailsRepository.findById(id).orElse(null);
		return new ResponseEntity<UserDetails>(userDetails, HttpStatus.OK);
	}

	@GetMapping(value = "/v1/members")
	public Object getMemberDetails() {
		Iterable<UserDetails> list = userDetailsRepository.findAll();
		return new ResponseEntity<Iterable<UserDetails>>(list, HttpStatus.OK);
	}

	@PostMapping(value = "/v1/members")
	public Object addMemberDetails(@RequestBody UserDetails userDetails) {
		userDetailsRepository.save(userDetails);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
