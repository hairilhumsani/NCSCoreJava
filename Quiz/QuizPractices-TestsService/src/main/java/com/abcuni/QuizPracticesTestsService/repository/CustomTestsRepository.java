package com.abcuni.QuizPracticesTestsService.repository;

import java.util.List;

import com.abcuni.QuizPracticesTestsService.model.Tests;

public interface CustomTestsRepository {
	
	public List<Tests> getTestByUserId (int id);

}
