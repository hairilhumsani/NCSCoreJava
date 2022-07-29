package com.abcuni.QuizPracticesJWTService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abcuni.QuizPracticesJWTService.model.Users;

@Repository
public interface AppUsersRepository extends JpaRepository<Users, Integer> 
{
	@Query("from Users where username = :username")
	public Users getUsersByUsername(String username);
	
}
