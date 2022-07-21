package com.abcuni.QuizPracticesQuestionService.repository;

import java.util.List;

import com.abcuni.QuizPracticesQuestionService.model.Question;

public interface CustomQuestionRepository {
	
	//CREATE
	
	
	//RETRIEVE
	public List<Question> getQuestionByCategory(String category);
	public List<Question> getQuestionByMarks(int marks);
	
	//UPDATE
	public void updateQuestion(int id);
	
	//DELETE
	
}
