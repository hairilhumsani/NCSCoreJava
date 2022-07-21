package com.abcuni.QuizPracticesUsersService.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcuni.QuizPracticesUsersService.model.Users;
import com.abcuni.QuizPracticesUsersService.service.UsersService;

@RestController
@RequestMapping("/api/users")
@Validated
public class UsersRestController {
	
	@Autowired
	UsersService usersService;
	
	public UsersRestController()
	{
		System.out.println("User Controller constructor called");
	}
	
	@GetMapping("/getAll")
	public List<Users> getAllUsers()
	{
		return usersService.getAllUsers();
	}

}
