package com.abcuni.QuizPracticesUsersService.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcuni.QuizPracticesUsersService.model.Users;

public class CustomUsersRepositoryImpl implements CustomUsersRepository {

	@Autowired
	EntityManager springDataJPA;

	@Override
	public List<Users> getUserByRole(String role) {
		String query = "from Users e where e.role = :role";

		Query q = springDataJPA.createQuery(query, Users.class);

		q.setParameter("role", role);
		@SuppressWarnings("unchecked")
		List<Users> queryOutput = (List<Users>) q.getResultList();
		return queryOutput;
	}

	@Override
	public List<Users> getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
