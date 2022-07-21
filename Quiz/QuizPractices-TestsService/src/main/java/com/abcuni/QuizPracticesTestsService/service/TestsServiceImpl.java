package com.abcuni.QuizPracticesTestsService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcuni.QuizPracticesTestsService.model.Tests;
import com.abcuni.QuizPracticesTestsService.repository.TestsRepository;

public class TestsServiceImpl implements TestsService {
	
	@Autowired
	TestsRepository testsRepository;
	
	@Override
	public List<Tests> getAll() {
		return testsRepository.findAll();
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}

}
