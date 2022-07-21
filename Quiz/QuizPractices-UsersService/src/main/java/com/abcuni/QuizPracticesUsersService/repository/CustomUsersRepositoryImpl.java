package com.abcuni.QuizPracticesUsersService.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcuni.QuizPracticesUsersService.model.Users;

public class CustomUsersRepositoryImpl implements CustomUsersRepository{

	@Autowired
	EntityManager springDataJPA;
	
	@Override
	public List<Users> getUserByRole(String role) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
