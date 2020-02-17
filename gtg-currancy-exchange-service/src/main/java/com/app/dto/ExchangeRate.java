package com.app.dto;

public class ExchangeRate {

	private String currancy;

	private String from;

	private String to;

	private Float conversionMultiple;

	public String getCurrancy() {
		return currancy;
	}

	public void setCurrancy(String currancy) {
		this.currancy = currancy;
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

	/**
	 * 
	 * @param                    currency, Symbolic name in which you want to
	 *                           convert used for Map key
	 * @param                    from, from the currency you want to convert
	 * @param to                 ,The currency which you want to convert.
	 * @param conversionMultiple
	 */
	public ExchangeRate(String currancy, String from, String to, Float conversionMultiple) {
		super();
		this.currancy = currancy;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}

}
