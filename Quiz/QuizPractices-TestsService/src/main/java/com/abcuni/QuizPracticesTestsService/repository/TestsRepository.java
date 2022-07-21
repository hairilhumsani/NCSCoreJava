package com.abcuni.QuizPracticesTestsService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abcuni.QuizPracticesTestsService.model.Tests;

@Repository
public interface TestsRepository extends JpaRepository<Tests,Integer> , CustomTestsRepository{

}
