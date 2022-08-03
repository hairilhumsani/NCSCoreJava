package com.abcuni.QuizPracticesUsersService.web;

import java.util.List;

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

import com.abcuni.QuizPracticesUsersService.model.Users;
import com.abcuni.QuizPracticesUsersService.service.UsersService;

@CrossOrigin
@RestController
@RequestMapping("/api/users")
public class UsersRestController {

	@Autowired
	UsersService usersService;

	public UsersRestController() {
		System.out.println("User Controller constructor called");
	}

	// RETRIEVE
	@GetMapping("/getAll")
	public List<Users> getAllUsers() {
		return usersService.getAllUsers();
	}

	@GetMapping("/getUsersByRole/{role}")
	public List<Users> getUsersByRole(@PathVariable String role) throws Exception {
		try {
			System.out.println(role);
			return usersService.getUserByRole(role);
		} catch (Exception e) {
			throw new Exception("Role unknown");
		}
	}

	// CREATE
	@PostMapping("/register")
	public Users addUser(@RequestBody Users users) throws Exception {
		Users user = null;
		try {
			user = usersService.saveUsers(users);
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

		return user;
	}

	// UPDATE
	@PutMapping("/updateUser")
	public ResponseEntity<Users> updateQuestion(@RequestBody Users u) throws Exception {
		Users update = usersService.updateUsers(u);
		try {
			return new ResponseEntity<Users>(update, HttpStatus.OK);
		} catch (Exception e) {
			throw new Exception("Invalid Movement");
		}

	}
	// DELETE

	@DeleteMapping("/deleteUser/{id}")
	public ResponseEntity<String> delete(@PathVariable int id) throws Exception {
		usersService.deleteUserById(id);
		try {
			return new ResponseEntity<String>(HttpStatus.OK);
		} catch (Exception e) {
			throw new Exception("Invalid Movement");
		}

	}

}
