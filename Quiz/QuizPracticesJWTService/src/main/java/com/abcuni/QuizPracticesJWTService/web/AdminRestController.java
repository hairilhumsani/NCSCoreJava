package com.abcuni.QuizPracticesJWTService.web;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/api/admin")
public class AdminRestController {

	@Autowired
	RestTemplate restTemplate;

	// -------------THIS IS FOR QUESTION ADMIN----------------------------
	@PostMapping("/addQuestion")
	public ResponseEntity<Question> addQuestion(@RequestBody Question q) {
		ResponseEntity<Question> result = restTemplate
				.postForEntity("http://QUIZPRACTICES-QUESTION/api/questions/addQuestion", q, Question.class);
		return result;
	}

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

	@GetMapping("/getByQuestionId/{id}")
	public Optional<Question> getQuestionById(@PathVariable int id) {
		ResponseEntity<Question> result = restTemplate
				.getForEntity("http://QUIZPRACTICES-QUESTION/api/questions/getById/" + id, Question.class);
		return Optional.of(result.getBody());
	}

	@PutMapping("/updateQuestion")
	public ResponseEntity<String> updateQuestion(@RequestBody Question q) {
		restTemplate.put("http://QUIZPRACTICES-QUESTION/api/questions/updateQuestion", q, Question.class);
		return new ResponseEntity<String>(HttpStatus.OK);
	}

	@DeleteMapping("/deleteQuestion/{id}")
	public ResponseEntity<String> deleteQuestion(@PathVariable int id) {
		restTemplate.delete("http://QUIZPRACTICES-QUESTION/api/questions/deleteQuestion/" + id, Question.class);
		return new ResponseEntity<String>(HttpStatus.OK);
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

}
