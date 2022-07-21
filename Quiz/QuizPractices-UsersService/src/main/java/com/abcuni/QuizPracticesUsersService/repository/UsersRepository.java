package com.abcuni.QuizPracticesUsersService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcuni.QuizPracticesUsersService.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users,Integer>, CustomUsersRepository{
	
}
