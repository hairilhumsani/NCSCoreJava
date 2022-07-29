package com.abcuni.QuizPracticesTestsService.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcuni.QuizPracticesTestsService.model.Tests;

public class CustomTestsRepositoryImpl implements CustomTestsRepository{

	
	@Autowired
	EntityManager springDataJPA;
	
	@Override
	public List<Tests> getTestByUserId(int id) {
		String query = "from Tests e where e.userId.userId = :id";
		Query q = springDataJPA.createQuery(query,Tests.class);
		q.setParameter("id", id);
		
		List<Tests> queryOutput = q.getResultList();
		return queryOutput;
	}

}
