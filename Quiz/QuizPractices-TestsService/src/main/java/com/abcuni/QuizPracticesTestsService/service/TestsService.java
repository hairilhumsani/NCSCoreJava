package com.abcuni.QuizPracticesTestsService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesTestsService.model.Tests;

@Service
public interface TestsService {
	
	public List<Tests> getAll();
	public void addUser();

}
