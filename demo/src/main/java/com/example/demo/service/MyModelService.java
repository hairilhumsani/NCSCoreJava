package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.exceptions.InvalidUserAgeException;
import com.example.demo.model.User;

@Service
public class MyModelService {

	
	public int doSum(int x ,int y)
	{
		return x+y;
	}
	
	public User createDefaultUser(String username,String password)
	{
		User user = new User(username, password, "Singapore", 20);
		return user;
	}
	
	public User createUser(String username,String password,String location , int age)throws InvalidUserAgeException
	{
		if(age<18)
		{
			throw new InvalidUserAgeException("age cannot be less than 18 , entered ["+age+"]");
		}
		else {
			
			User user = new User(username, password, location, age);
			return user;
		}
		
	}
	
	public List<User> getUsers()
	{
		List<User> allUsers = new ArrayList<>();
		
		User user1 = new User("a", "a", "ABC-123", 23);
		User user2 = new User("b", "a", "ABC-123", 23);
		User user3 = new User("c", "a", "ABC-123", 23);
		
		allUsers.add(user1);
		allUsers.add(user2);
		allUsers.add(user3);
		
		return allUsers;
				
		
	}
	
}




















