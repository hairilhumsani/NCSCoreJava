package com.abcuni.QuizPracticesUsersService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesUsersService.model.Users;

@Service
public interface UsersService {
	
	//JPA
	public List<Users> getAllUsers();
	public void deleteUserById(int id);
	
	//Custom
	public List<Users> getUsersByUsername(String username);
	public List<Users> getUserByEmail(String email);

}
