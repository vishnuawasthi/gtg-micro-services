package com.app.filter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class ZuulLoggingFilter extends ZuulFilter {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		// getting the current HTTP request that is to be handle

		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		HttpServletResponse response = RequestContext.getCurrentContext().getResponse();
		// printing the detail of the request

		logger.info("request -> {} request uri-> {}", request, request.getRequestURI());
		
	
	//	request.setAttribute("API_KEY", apiKey);
		
		String apiKey =request.getParameter("apiKey");
		
		System.out.println("apiKey -> "+apiKey);
		
		if("ADMIN".equalsIgnoreCase(apiKey)) {
			return null;
		}
		
		response.setStatus(400);
//		request.set
		
		//request.getServletContext().setInitParameter("API_KEY", apiKey);
		
		return "Invalid requst";
	}

	@Override
	public boolean isFilterDisabled() {
		return false;
	}

	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 1;
	}

}
