package com.example.demo.dto;

import org.springframework.stereotype.Component;

@Component
public class AppUserRequestDTO {
	
	
	private String username;
	private String password;
	private int age;
	private long pincode;
	private String role;
	public AppUserRequestDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public AppUserRequestDTO(String username, String password, int age, long pincode, String role) {
		super();
		this.username = username;
		this.password = password;
		this.age = age;
		this.pincode = pincode;
		this.role = role;
	}
	@Override
	public String toString() {
		return "AppUserRequestDTO [username=" + username + ", password=" + password + ", age=" + age + ", pincode="
				+ pincode + ", role=" + role + "]";
	}
}
