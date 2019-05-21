package com.app.models;

public class AlphaDirectModel {
	
	private String legalEntityIden;
	private String legalOrgName;
	private String legalForm;
	
	
	
	public AlphaDirectModel() {
		super();
	}
	public AlphaDirectModel(String legalEntityIden, String legalOrgName,
			String legalForm) {
		super();
		this.legalEntityIden = legalEntityIden;
		this.legalOrgName = legalOrgName;
		this.legalForm = legalForm;
	}
	public String getLegalEntityIden() {
		return legalEntityIden;
	}
	public void setLegalEntityIden(String legalEntityIden) {
		this.legalEntityIden = legalEntityIden;
	}
	public String getLegalOrgName() {
		return legalOrgName;
	}
	public void setLegalOrgName(String legalOrgName) {
		this.legalOrgName = legalOrgName;
	}
	public String getLegalForm() {
		return legalForm;
	}
	public void setLegalForm(String legalForm) {
		this.legalForm = legalForm;
	}
	@Override
	public String toString() {
		return "AlphaDirectModel [legalEntityIden=" + legalEntityIden
				+ ", legalOrgName=" + legalOrgName + ", legalForm=" + legalForm
				+ "]";
	}
	
	
	
	

}
