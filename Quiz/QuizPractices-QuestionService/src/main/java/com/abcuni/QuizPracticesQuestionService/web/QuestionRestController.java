package com.abcuni.QuizPracticesQuestionService.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcuni.QuizPracticesQuestionService.model.Question;
import com.abcuni.QuizPracticesQuestionService.service.QuestionService;

@RestController
@RequestMapping("/api/questions")
@Validated
public class QuestionRestController {

	@Autowired
	QuestionService questionService;

	public QuestionRestController() {
		System.out.println("Question Controller constructor called");
	}

	@GetMapping("/getAll")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestion();
	}

	@GetMapping("/getByCategory/{category}")
	public ResponseEntity<List<Question>> getByCategory(@PathVariable String category) throws Exception {
		List<Question> getQuestions = questionService.getQuestionbyCategory(category);

		if (getQuestions != null) {
			return new ResponseEntity<List<Question>>(getQuestions, HttpStatus.OK);
		} else {
			throw new Exception("Invalid Category");
		}
	}
	
	@GetMapping("/getByMarks/{marks}")
	public ResponseEntity<List<Question>> getByMarks(@PathVariable int marks) throws Exception {
		List<Question> getQuestions = questionService.getQuestionbyMarks(marks);

		if (getQuestions != null) {
			return new ResponseEntity<List<Question>>(getQuestions, HttpStatus.OK);
		} else {
			throw new Exception("Invalid Category");
		}
	}
}
