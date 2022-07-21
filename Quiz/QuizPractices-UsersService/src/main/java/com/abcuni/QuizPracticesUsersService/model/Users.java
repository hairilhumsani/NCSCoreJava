package com.abcuni.QuizPracticesUsersService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@NotNull(message = "Username cannot be blank")
	@Length(min = 5, message = "Username must have more than 5 characters")
	private String username;

	@NotNull(message = "Password cannot be blank")
	@Length(min = 8, message = "Password must have more than 8 characters")
	private String password;
	private String role;

	@Email(message = "Enter a proper email")
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

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", email=" + email + "]";
	}

}
