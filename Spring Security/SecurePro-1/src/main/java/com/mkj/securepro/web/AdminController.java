package com.mkj.securepro.web;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
public class AdminController {

	@GetMapping("/dothings")
	public String diThings()
	{
		System.out.println("inside admin do things called");
		return "admin dothings ";
	}
}
