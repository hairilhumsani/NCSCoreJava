package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MySecuredUsers;
import com.example.demo.service.AppUserService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AppUserService appUserService;
	
	
	@PostMapping("/saveusers")
	public MySecuredUsers addUsers(@RequestBody MySecuredUsers appUsers)
	{
		return   appUserService.saveUsers(appUsers);
	}
	
	@GetMapping("/users")
	public String doSomeAdminWork()
	{
		return  "admin calls get all users list";
	}
	
	

}
