package com.abcuni.QuizPracticesQuestionService.repository;

import java.util.List;

import com.abcuni.QuizPracticesQuestionService.model.Question;

public interface CustomQuestionRepository {
	
	public List <Question> getAllQuestion(); 
	public List<Question> getQuestionByCategory(String category);
	
}
