package com.abcuni.QuizPracticesQuestionService.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abcuni.QuizPracticesQuestionService.model.Question;
import com.abcuni.QuizPracticesQuestionService.service.QuestionService;

@CrossOrigin
@RestController
@RequestMapping("/api/questions")
@Validated
public class QuestionRestController {

	@Autowired
	QuestionService questionService;

	public QuestionRestController() {
		System.out.println("Question Controller constructor called");
	}
	
	
	//CREATE
	@PostMapping("/addQuestion")
	public ResponseEntity<Question> addQuestion(@RequestBody Question q) throws Exception
	{
		Question queryAddQuestion = questionService.addQuestion(q);
		return new ResponseEntity<Question>(queryAddQuestion,HttpStatus.OK);
	}
	
	
	//RETRIEVE
	@GetMapping("/getAll")
	public List<Question> getAllQuestions() {
		return questionService.getAllQuestion();
	}

	@GetMapping("/getByCategory/{category}")
	public List<Question> getByCategory(@PathVariable String category) throws Exception {
		List<Question> getQuestions = questionService.getQuestionbyCategory(category);

		if (getQuestions != null) {
			return getQuestions;
		} else {
			throw new Exception("Invalid Category");
		}
	}
	
	@GetMapping("/getById/{id}")
	public Optional<Question> getById(@PathVariable int id) throws Exception
	{
		Optional<Question> result = questionService.getQuestionById(id);
		if (result.isPresent())
		{
			return result;
		}
		else
		{
			throw new Exception("Invalid Id");
		}
	}
	
	@GetMapping("/getByMarks/{marks}")
	public ResponseEntity<List<Question>> getByMarks(@PathVariable int marks) throws Exception {
		List<Question> getQuestions = questionService.getQuestionbyMarks(marks);

		if (getQuestions != null) {
			return new ResponseEntity<List<Question>>(getQuestions, HttpStatus.OK);
		} else {
			throw new Exception("Invalid Difficulty");
		}
	}
	
	
	//UPDATE
	
	@PutMapping("/updateQuestion")
	public ResponseEntity<Question> updateQuestion(@RequestBody Question q) throws Exception
	{
		Question update = questionService.updateQuestion(q);
		try {
			return new ResponseEntity<Question>(update,HttpStatus.OK);
		}
		catch (Exception e)
		{
			throw new Exception("Invalid Movement");
		}
		
	}
	//DELETE
	
	
	@DeleteMapping("/deleteQuestion/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) throws Exception
	{
		questionService.deleteQuestion(id);
		try {
			return new ResponseEntity<String>(HttpStatus.OK);
		}
		catch (Exception e)
		{
			throw new Exception("Invalid Movement");
		}
		
	}

	
}//END OF CLASS
