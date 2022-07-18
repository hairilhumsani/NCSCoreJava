package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.exceptions.InvalidUserAgeException;
import com.example.demo.model.User;

@SpringBootTest
class MyModelServiceTest {

	@Autowired
	MyModelService serviceToTest;

	@BeforeEach
	void setUp() throws Exception {
		// System.out.println(" Set up method called");
	}

	@AfterEach
	void tearDown() throws Exception {
		// System.out.println(" tear down method called");
	}

	@Test
	@DisplayName("test - calculate sum")
	@Disabled
	void testDoSum() {
		// given
		int sampleData1 = 10;
		int sampleData2 = 20;
		int expectedOutput = 30;

		// action
		int actualOutput = serviceToTest.doSum(sampleData1, sampleData2);

		// verify

		assertEquals(expectedOutput, actualOutput);

	}

	@Test
	@DisplayName("test- creatation of default user")
	@Disabled
	public void testCreateDefaultUser() {
		// given
		String sampleUsername = "mike";
		String samplePassword = "123";

		User expectedOutput = new User(sampleUsername, samplePassword, "Singapore", 20);

		// action
		User actulOutput = serviceToTest.createDefaultUser(sampleUsername, samplePassword);

		assertEquals(expectedOutput, actulOutput);

	}

	@Test
	@DisplayName("test - create user")
	public void testCreateUser() {

		// given
		String sampleUsername = "mike";
		String samplePassword = "123";
		String location = "Singapore";
		int age = 22;

		User expectedOutput = new User(sampleUsername, samplePassword, location,age);

		// action
		User actulOutput = null;
		try {
			actulOutput = serviceToTest.createUser(sampleUsername, samplePassword,location,age);
		} catch (InvalidUserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assertEquals(expectedOutput, actulOutput);
	}
	
	
	@Test
	@DisplayName("test - throw exception while invalid user age-17")
	public void testCreateUserExcption1() {

		// given
		String sampleUsername = "mike";
		String samplePassword = "123";
		String location = "Singapore";
		int age = 17;

		User expectedOutput = new User(sampleUsername, samplePassword, location,age);

		// action
		try {
			User actulOutput = serviceToTest.createUser(sampleUsername, samplePassword,location,age);
		} catch (InvalidUserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Throwable exception = assertThrows(
			      InvalidUserAgeException.class, 
			      () -> {
			          throw new InvalidUserAgeException("age cannot be less than 18 , entered ["+age+"]");
			      }
			    );
		assertEquals("age cannot be less than 18 , entered ["+age+"]", exception.toString());
	}
	
	@Test
	@DisplayName("test - throw exception while invalid user age-18")
	public void testCreateUserExcption() {

		// given
		String sampleUsername = "mike";
		String samplePassword = "123";
		String location = "Singapore";
		int age = 17;

		User expectedOutput = new User(sampleUsername, samplePassword, location,age);

		// action
		try {
			User actulOutput = serviceToTest.createUser(sampleUsername, samplePassword,location,age);
		} catch (InvalidUserAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Throwable exception = assertThrows(
			      InvalidUserAgeException.class, 
			      () -> {
			          throw new InvalidUserAgeException("age cannot be less than 18 , entered ["+age+"]");
			      }
			    );
		assertEquals("age cannot be less than 18 , entered ["+age+"]", exception.toString());
	}
	
	@Test
	@DisplayName("Test - Get All Users")
	@Disabled
	public void testGetUsers() {
		// given
		List<User> expectedUsers = new ArrayList<>();

		User user1 = new User("a", "a", "ABC-123", 23);
		User user2 = new User("b", "a", "ABC-123", 23);
		User user3 = new User("c", "a", "ABC-123", 23);

		expectedUsers.add(user1);
		expectedUsers.add(user2);
		expectedUsers.add(user3);

		// action

		List<User> actualUsers = serviceToTest.getUsers();

		// verify
		// assertEquals(expectedUsers, actualUsers);
		assertIterableEquals(expectedUsers, actualUsers);
	}

}// end class
