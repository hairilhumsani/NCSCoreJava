package com.ncs.empconsole.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
public class Department {

	@Id
	private int dCode; // d stands for department
	private String name;
	
	
	public Department(int dCode,String departmentName)
	{
		this.dCode = dCode;
		this.name = departmentName;
		
	}
	public int getdCode() {
		return dCode;
	}
	public void setdCode(int dCode) {
		this.dCode = dCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Department [dCode=" + dCode + ", name=" + name + "]";
	}
	
	
	
	
	
}
