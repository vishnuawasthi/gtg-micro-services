package com.app.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.app.dto.CurrencyConversionResponse;
import com.app.restclients.ExchangeServiceRestClientProxy;

@RestController
public class CurrencyConversionController {

	@Autowired
	private ExchangeServiceRestClientProxy exchangeServiceRestClient;

	@GetMapping(value = "/convert", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object convert(@RequestParam String from, @RequestParam String to, @RequestParam Long amount) {

		System.out.println("from     : " + from);
		System.out.println("to       : " + to);
		System.out.println("amount   : " + amount);

		// ExchangeRate

		// http://localhost:8083//exchange-rate/USD/to/INR

		Map<String, String> uriVariables = new HashMap<>();

		uriVariables.put("from", from);

		uriVariables.put("to", to);

		//RestTemplate restTemplate = new RestTemplate();

		/*ResponseEntity<CurrencyConversionResponse> responseEntity = restTemplate.getForEntity(
				"http://localhost:8083/exchange-rate/{from}/to/{to}", CurrencyConversionResponse.class, uriVariables);

		CurrencyConversionResponse response = responseEntity.getBody();

		if (Objects.nonNull(response)) {
			Float convertedAmount = response.getConvertedAmount(amount);
			response.setConvertedAmount(convertedAmount);
		}*/

		//System.out.println("response   -> " + response);

		String responseByFeignClient = exchangeServiceRestClient.convert(from, to);
		System.out.println("responseByFeignClient -> "+responseByFeignClient);
		
		
		
		return new ResponseEntity<String>(responseByFeignClient, HttpStatus.OK);

	}

}
