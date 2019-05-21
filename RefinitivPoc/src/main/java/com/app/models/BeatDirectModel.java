package com.app.models;

public class BeatDirectModel {
	
	private String legalEntityIden;
	private String tickerCode;
	
	
	public BeatDirectModel() {
		super();
	}
	
	
	public BeatDirectModel(String legalEntityIden, String tickerCode) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.tickerCode = tickerCode;
	}


	public String getLegalEntityIden() {
		return legalEntityIden;
	}
	public void setLegalEntityIden(String legalEntityIden) {
		this.legalEntityIden = legalEntityIden;
	}
	public String getTickerCode() {
		return tickerCode;
	}
	public void setTickerCode(String tickerCode) {
		this.tickerCode = tickerCode;
	}


	@Override
	public String toString() {
		return "BeatDirectModel [legalEntityIden=" + legalEntityIden
				+ ", tickerCode=" + tickerCode + "]";
	}
	
	

}
