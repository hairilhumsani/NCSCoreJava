package com.mkj.securepro.web;


import javax.annotation.security.RolesAllowed;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@GetMapping("/getdata")
	public String diThings()
	{
		System.out.println("inside welcome-employee called");
		return "Welcome-employee";
	}
	

	
	@PreAuthorize("hasRole('admin')")
	@GetMapping("/doChange")
	public String doChange()
	{
		System.out.println("inside employee post called");
		return "post mapping called";
	}
}
