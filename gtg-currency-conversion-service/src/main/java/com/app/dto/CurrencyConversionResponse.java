package com.app.dto;

public class CurrencyConversionResponse {

	private String currency;

	private String from;

	private String to;

	private Float conversionMultiple;

	private Float convertedAmount;

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

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Float getConvertedAmount(Long amount) {

		Float totalAmount = amount * conversionMultiple;
		return totalAmount;
	}

	public void setConvertedAmount(Float convertedAmount) {
		this.convertedAmount = convertedAmount;
	}

	@Override
	public String toString() {
		return "CurrencyConversionResponse [currency=" + currency + ", from=" + from + ", to=" + to
				+ ", conversionMultiple=" + conversionMultiple + ", convertedAmount=" + convertedAmount + "]";
	}

}
