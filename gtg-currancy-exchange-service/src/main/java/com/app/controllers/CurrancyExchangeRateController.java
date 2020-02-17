package com.app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ExchangeRate;
import com.app.entities.ExchangeValue;
import com.app.repositories.ExchangeValueRepository;

@RestController
public class CurrancyExchangeRateController {

	@Autowired
	private ExchangeValueRepository exchangeValueRepository;

	@GetMapping(value = "/exchange-rate/{from}/to/{to}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getExhcangeRate(@PathVariable String from, @PathVariable String to) {

		ExchangeValue entity = exchangeValueRepository.findByFromAndTo(from, to);
		return new ResponseEntity<ExchangeValue>(entity, HttpStatus.OK);

	}

	/*
	 * @GetMapping(value = "/exchange-rate/{from}/to/{to}", produces =
	 * MediaType.APPLICATION_JSON_VALUE) public Object getExhcangeRate(@PathVariable
	 * String from, @PathVariable String to) {
	 * 
	 * 
	 * ExchangeRate exchangeRate =
	 * getExchangeRate().entrySet().stream().filter(exchange->
	 * exchanlge.getKey().equalsIgnoreCase(from); }));
	 * 
	 * 
	 * Map<String, ExchangeRate> map = getExchangeRate();
	 * 
	 * ExchangeRate exchangeRate = null;
	 * 
	 * for (Map.Entry<String, ExchangeRate> entry : map.entrySet()) {
	 * 
	 * if (entry.getKey().equalsIgnoreCase(from)) { exchangeRate =
	 * map.get(entry.getKey()); break; }
	 * 
	 * }
	 * 
	 * return new ResponseEntity<ExchangeRate>(exchangeRate, HttpStatus.OK);
	 * 
	 * }
	 */

	public Map<String, ExchangeRate> getExchangeRate() {
		Map<String, ExchangeRate> currancyMap = new HashMap<String, ExchangeRate>();
		currancyMap.put("INR", new ExchangeRate("INR", "INR", "USD", Float.valueOf(76)));
		currancyMap.put("PKR", new ExchangeRate("PKR", "PKR", "INR", Float.valueOf(2.16f)));
		return currancyMap;

	}

}
