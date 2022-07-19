package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

@Entity
public class MySecuredUsers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message = "username cannot be null")
	@Length(min = 5, message = "username must have at least 5 characters")
	private String username;
	
	@NotEmpty(message = "Password cannot be null")
	@Length(min = 5, message = "Password must have at least 5 characters")
	private String password;
	private int age;
	
	@Digits(integer = 8,fraction = 0)
	private long pincode;
	private String role;
	
	
	
	public MySecuredUsers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "MySecuredUsers [id=" + id + ", username=" + username + ", password=" + password + ", age=" + age
				+ ", pincode=" + pincode + ", role=" + role + "]";
	}
	
	
	
	
	
	

}
