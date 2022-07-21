package com.abcuni.QuizPracticesTestsService.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcuni.QuizPracticesTestsService.model.Tests;
import com.abcuni.QuizPracticesTestsService.service.TestsService;

@RestController
@RequestMapping("/api/tests")
@Validated

public class TestsRestController {
	
	@Autowired
	TestsService testService;
	
	public TestsRestController()
	{
		System.out.println("Test Controller constructor called");
	}
	
	@GetMapping("/getAll")
	public List<Tests> getAllTests()
	{
		return testService.getAll();
	}

}
