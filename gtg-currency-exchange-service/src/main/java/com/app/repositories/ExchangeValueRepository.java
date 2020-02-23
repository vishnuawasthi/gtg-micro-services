package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.ExchangeValue;

public interface ExchangeValueRepository extends    JpaRepository<ExchangeValue, String> {

	ExchangeValue findByFromAndTo(String from, String to);
	
}
