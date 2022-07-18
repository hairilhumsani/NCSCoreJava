package com.mkj.securepro.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/public")
public class HomeRestController {

	@GetMapping("/welcome")
	public String diThings()
	{
		System.out.println("inside welcome called");
		return "Welcome";
	}
}
