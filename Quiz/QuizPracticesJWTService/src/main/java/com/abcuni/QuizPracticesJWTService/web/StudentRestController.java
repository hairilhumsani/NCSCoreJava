package com.abcuni.QuizPracticesJWTService.web;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.abcuni.QuizPracticesJWTService.model.Question;
import com.abcuni.QuizPracticesJWTService.model.Tests;
import com.abcuni.QuizPracticesJWTService.model.Users;


@CrossOrigin
@RestController
@RequestMapping("/api/student")
public class StudentRestController {
	
	@Autowired
	RestTemplate restTemplate;

	// -------------THIS IS FOR QUESTION STUDENT---------------------------
	@GetMapping("/getQuestions")
	public List<Question> getAll() {
		ResponseEntity<Question[]> result = restTemplate
				.getForEntity("http://QUIZPRACTICES-QUESTION/api/questions/getAll", Question[].class);
		return Arrays.asList(result.getBody());
	}

	@GetMapping("/getByCategory/{category}")
	public List<Question> getQuestionByCategory(@PathVariable String category) {
		ResponseEntity<Question[]> result = restTemplate.getForEntity(
				"http://QUIZPRACTICES-QUESTION/api/questions/getByCategory/" + category, Question[].class);
		return Arrays.asList(result.getBody());
	}

	// ----------------THIS IS FOR USERS(STUDENTS) ADMIN PAGE---------------------
	@GetMapping("/getAllUsers")
	public List<Users> getAllUser() {
		ResponseEntity<Users[]> result = restTemplate.getForEntity("http://QUIZPRACTICES-USER/api/users/getAll",
				Users[].class);
		return Arrays.asList(result.getBody());
	}

	@GetMapping("/getUsersByRole/{role}")
	public List<Users> getUserByRole(@PathVariable String role) {
		ResponseEntity<Users[]> result = restTemplate
				.getForEntity("http://QUIZPRACTICES-USER/api/users/getUsersByRole/" + role, Users[].class);
		return Arrays.asList(result.getBody());
	}

	@GetMapping("/getTestByUserId/{id}")
	public List<Tests> getTestByUserId(@PathVariable int id) {
		ResponseEntity<Tests[]> result = restTemplate.getForEntity("http://QUIZPRACTICES-TEST/api/tests/getById/" + id,
				Tests[].class);
		return Arrays.asList(result.getBody());
	}

	@PutMapping("/updateUser")
	public ResponseEntity<String> updateUser(@RequestBody Users u) {
		restTemplate.put("http://QUIZPRACTICES-USER/api/users/updateUser", u, Users.class);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable int id) {
		restTemplate.delete("http://QUIZPRACTICES-USER/api/users/deleteUser/" + id, Users.class);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
	
	// -----------------THIS IS FOR TESTS FOR STUDENTS ----------
	

}
