package com.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.MemberDetails;

//http://localhost:8088/api/v1/members
@RestController
@RequestMapping(value = "/api")
public class MemberDetailsController {

	@GetMapping(value = "/v1/members")
	public Object getMemberDetails() {
		MemberDetails memberDetails = new MemberDetails();
		memberDetails.setFirstname("Vishnu");
		memberDetails.setLastname("Awasthi");
		memberDetails.setAge(30);

		return new ResponseEntity<List<MemberDetails>>(Arrays.asList(memberDetails), HttpStatus.OK);
	}

}
