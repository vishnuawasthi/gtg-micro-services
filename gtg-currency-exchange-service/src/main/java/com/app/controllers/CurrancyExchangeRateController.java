package com.app.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;

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

	@GetMapping(value = "/exchange-rates/{from}/to/{to}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getExhcangeRate(
			@PathVariable String from, 
			@PathVariable String to, 
			HttpServletRequest request) {
//getParameter("API_KEY")
		System.out.println("API_KEY-> "+request.getAttribute("API_KEY"));
		
		
		//String apiParamKey = request.getServletContext().getInitParameter("API_KEY");
		
		//System.out.println("apiParamKey -> "+apiParamKey);
		
		
		ExchangeValue entity = exchangeValueRepository.findByFromAndTo(from, to);

		int port = request.getServerPort();

		if (Objects.nonNull(entity)) {
			entity.setPort(port);
		}

		return new ResponseEntity<ExchangeValue>(entity, HttpStatus.OK);

	}

	@GetMapping(value = "/exchange-rates", produces = MediaType.APPLICATION_JSON_VALUE)
	public Object getAllExhcangeRate(HttpServletRequest request) {

		List<ExchangeValue> entities = exchangeValueRepository.findAll();
		int port = request.getServerPort();

		if (Objects.nonNull(entities)) {
			entities.forEach(exchangeVal -> {
				exchangeVal.setPort(port);
			});
		}

		return new ResponseEntity<List<ExchangeValue>>(entities, HttpStatus.OK);

	}

	public Map<String, ExchangeRate> getExchangeRate() {
		Map<String, ExchangeRate> currancyMap = new HashMap<String, ExchangeRate>();
		currancyMap.put("INR", new ExchangeRate("INR", "INR", "USD", Float.valueOf(76)));
		currancyMap.put("PKR", new ExchangeRate("PKR", "PKR", "INR", Float.valueOf(2.16f)));
		return currancyMap;

	}

}
