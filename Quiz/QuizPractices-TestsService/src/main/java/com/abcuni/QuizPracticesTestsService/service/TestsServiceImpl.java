package com.abcuni.QuizPracticesTestsService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesTestsService.model.Tests;
import com.abcuni.QuizPracticesTestsService.repository.TestsRepository;

@Service
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

	@Override
	public List<Tests> getTestById(int id) {
		return testsRepository.getTestByUserId(id);
	}

}
