package com.abcuni.QuizPracticesQuestionService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abcuni.QuizPracticesQuestionService.model.Question;
import com.abcuni.QuizPracticesQuestionService.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	QuestionRepository questionRepository;

	@Override
	public List<Question> getAllQuestion() {
		return questionRepository.findAll();
	}

	@Override
	public List<Question> getQuestionbyCategory(String Category) {
		return questionRepository.getQuestionByCategory(Category);
	}

	@Override
	public void deleteQuestion(int id) {
		questionRepository.deleteById(id);
	}

	@Override
	public List<Question> getQuestionbyMarks(int marks) {
		return questionRepository.getQuestionByMarks(marks);
	}

	@Override
	public Question addQuestion(Question q) {
		Question addQuestion = questionRepository.save(q);
		return addQuestion;
	}

	@Override
	public Optional<Question> getQuestionById(int id) {
		Optional<Question> getQuestion = questionRepository.findById(id);
		return getQuestion;
	}

	@Override
	public Question updateQuestion(Question q) {
		Question update = questionRepository.save(q);
		return update;
	}

	@Override
	public void deleteQuestion(Question q) {
		questionRepository.delete(q);
	}
	
	

}
