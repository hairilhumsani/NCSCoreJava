package com.abcuni.QuizPracticesUsersService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesUsersService.model.Users;
import com.abcuni.QuizPracticesUsersService.repository.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersRepository usersRepository;

	@Override
	public List<Users> getAllUsers() {
		return usersRepository.findAll();
	}

	@Override
	public void deleteUserById(int id) {
		usersRepository.deleteById(id);
		
	}

	@Override
	public List<Users> getUsersByUsername(String username) {
		return usersRepository.getUserByUsername(username);
	}

	@Override
	public List<Users> getUserByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users saveUsers(Users user) {
		return usersRepository.save(user);
	}

}
