package com.abcuni.QuizPracticesJWTService.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abcuni.QuizPracticesJWTService.model.Question;

@CrossOrigin(origins= {"http://localhost:8081"},allowedHeaders = "*")
@RestController
@RequestMapping("/api/admin")
public class AdminRestController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/getQuestions")
	public List<Question> getAll()
	{
		ResponseEntity<Question[]> result = restTemplate.getForEntity("http://QUIZPRACTICES-JWTSERVICE/api/questions/getAll", Question[].class);
		return Arrays.asList(result.getBody());
	}

}
