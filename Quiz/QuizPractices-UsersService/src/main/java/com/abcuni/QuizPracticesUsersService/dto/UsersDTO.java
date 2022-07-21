package com.abcuni.QuizPracticesUsersService.dto;

import org.springframework.stereotype.Component;

@Component
public class UsersDTO {

	
	private int userId;
	private String username;
	private String password;
	private String role;
	private String email;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UsersDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UsersDTO [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", email=" + email + "]";
	}

}
