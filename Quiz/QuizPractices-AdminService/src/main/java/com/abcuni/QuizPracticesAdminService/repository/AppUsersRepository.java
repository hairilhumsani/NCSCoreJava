package com.abcuni.QuizPracticesAdminService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abcuni.QuizPracticesAdminService.dto.UsersDTO;
import com.abcuni.QuizPracticesAdminService.model.Users;

@Repository
public interface AppUsersRepository extends JpaRepository<Users, Integer> 
{
	@Query("from Users where username = :username")
	public Users getUsersByUsername(String username);
	
	
	@Query("from Users where pincode = :pin")
	public List<Users> getUsersByPin(long pin);
}
