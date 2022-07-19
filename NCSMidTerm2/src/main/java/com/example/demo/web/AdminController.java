package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MySecuredUsers;
import com.example.demo.repository.AppUsersRepository;
import com.example.demo.service.AdminService;
import com.example.demo.service.AppUserService;

@RestController
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@Autowired
	AppUsersRepository appUserRepository;
	
	
	@GetMapping("/users")
	public List<MySecuredUsers> getAllUsers()
	{
		return  adminService.getAllUser();
	}

	@GetMapping("/users/{pincode}")
	public List<MySecuredUsers>getUsersByPinCode(@PathVariable long pincode){
		
		return adminService.getUserByPin(pincode);
	}

}
