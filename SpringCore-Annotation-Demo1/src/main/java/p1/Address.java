package p1;

import javax.persistence.Embeddable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	@Value("Test-123")
	private String houseNumber;
	private String cityName;
	private String state;
	private String country;
	private long pincode;
	
	
	public Address(String houseNumber, String cityName, String state, String country, long pincode) {
		super();
		this.houseNumber = houseNumber;
		this.cityName = cityName;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", cityName=" + cityName + ", state=" + state + ", country="
				+ country + ", pincode=" + pincode + "]";
	}
	
	
}
