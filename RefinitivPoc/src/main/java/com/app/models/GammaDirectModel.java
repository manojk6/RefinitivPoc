package com.app.models;

public class GammaDirectModel {
	private String legalEntityIden;
	private String businessRegCode;
	
	
	public GammaDirectModel() {
		super();
	}


	public GammaDirectModel(String legalEntityIden, String businessRegCode) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.businessRegCode = businessRegCode;
	}


	public String getLegalEntityIden() {
		return legalEntityIden;
	}


	public void setLegalEntityIden(String legalEntityIden) {
		this.legalEntityIden = legalEntityIden;
	}


	public String getBusinessRegCode() {
		return businessRegCode;
	}


	public void setBusinessRegCode(String businessRegCode) {
		this.businessRegCode = businessRegCode;
	}


	@Override
	public String toString() {
		return "GammaDirectModel [legalEntityIden=" + legalEntityIden
				+ ", businessRegCode=" + businessRegCode + "]";
	}
	
	
	

}
