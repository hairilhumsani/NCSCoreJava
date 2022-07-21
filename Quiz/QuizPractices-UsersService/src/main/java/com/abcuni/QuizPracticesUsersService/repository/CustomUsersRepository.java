package com.abcuni.QuizPracticesUsersService.repository;

import java.util.List;

import com.abcuni.QuizPracticesUsersService.model.Users;

public interface CustomUsersRepository {
	
	public List<Users> getUserByRole(String role);
	public List<Users> getUserByUsername(String username);

}
