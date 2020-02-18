package com.app.restclients;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(url = "http://localhost:8083", name = "exchangeServiceRestClient")

@FeignClient(name = "exchangeServiceRestClient")

@RibbonClient(name = "exchangeServiceRestClient")
public interface ExchangeServiceRestClientProxy {

	@RequestMapping(value = "/exchange-rate/{from}/to/{to}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	String convert(@PathVariable String from, @PathVariable String to);

}
