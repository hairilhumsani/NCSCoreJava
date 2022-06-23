package com.ncs.model;

import java.sql.Date;

public class Instructor {

	
	private int instructorId;
	private String instructorName;
	private Date dateOfJoining;
	private String location;
	
	
	public int getInstructorId() {
		return instructorId;
	}
	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}
	public String getInstructorName() {
		return instructorName;
	}
	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Instructor(int instructorId, String instructorName, Date dateOfJoining, String location) {
		super();
		this.instructorId = instructorId;
		this.instructorName = instructorName;
		this.dateOfJoining = dateOfJoining;
		this.location = location;
	}
	
	
	
	
}
