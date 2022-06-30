package model;

import javax.persistence.Embeddable;

@Embeddable
public class Insurance {
	
	private int policyNumber;
	private String insuranceName;
	
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsuranceName() {
		return insuranceName;
	}
	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}
	public Insurance(int policyNumber, String insuranceName) {
		super();
		this.policyNumber = policyNumber;
		this.insuranceName = insuranceName;
	}
	
	public Insurance() {
		super();
		
	}
	
	
	
	

}
