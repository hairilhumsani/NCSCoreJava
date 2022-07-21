package com.abcuni.QuizPracticesQuestionService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesQuestionService.model.Question;

@Service
public interface QuestionService {
	
	
	//JPA Query
	public Question addQuestion(Question q);
	public List<Question> getAllQuestion();
	public void deleteQuestion(int id);
	//Custom Query
	public List<Question> getQuestionbyCategory(String category);
	public List<Question> getQuestionbyMarks(int marks);
	

}
