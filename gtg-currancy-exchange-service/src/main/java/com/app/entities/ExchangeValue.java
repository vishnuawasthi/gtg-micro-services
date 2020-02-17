package com.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXCHANGE_RATE")
public class ExchangeValue {

	@Id
	@Column(name = "ID")
	private String id;

	@Column(name = "FROM_CURRENCY")
	private String from;

	@Column(name = "TO_CURRENCY")
	private String to;

	@Column(name = "CON_MLTL")
	private Float conversionMultiple;

	@Column(name = "PORT")
	private int port;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Float getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(Float conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
