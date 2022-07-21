package com.abcuni.QuizPracticesQuestionService.repository;

import java.util.List;

import com.abcuni.QuizPracticesQuestionService.model.Question;

public interface CustomQuestionRepository {
	
	public List<Question> getQuestionByCategory(String category);
	public List<Question> getQuestionByMarks(int marks);
	public void updateQuestion(int id);
	
}
