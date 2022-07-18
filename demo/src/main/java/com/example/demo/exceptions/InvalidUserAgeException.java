package com.example.demo.exceptions;

public class InvalidUserAgeException extends Exception {
	
	String msg;

	public InvalidUserAgeException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String toString() {
		return msg;
	}
	
	

}
