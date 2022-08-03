package com.abcuni.QuizPracticesQuestionService.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.abcuni.QuizPracticesQuestionService.model.Question;

public class CustomQuestionRepositoryImpl implements CustomQuestionRepository{

	@Autowired
	EntityManager springDataJPA;

	@Override
	public List<Question> getQuestionByCategory(String category) {
		// TODO Auto-generated method stub
		String query = "from Question e where e.category = :category";
		Query q = springDataJPA.createQuery(query,Question.class);
		
		q.setParameter("category", category);
		@SuppressWarnings("unchecked")
		List<Question> queryOutput = (List<Question>) q.getResultList();
		return queryOutput;
	}
	
	@Override
	public Question getQuestionById(int id) {
		// TODO Auto-generated method stub
		String query = "from Question e where e.questionId = :questionId";
		Query q = springDataJPA.createQuery(query,Question.class);
		
		q.setParameter("questionId", id);
		@SuppressWarnings("unchecked")
		Question queryOutput = (Question) q.getSingleResult();
		return queryOutput;
	}

	@Override
	public List<Question> getQuestionByMarks(int marks) {
		String query = "from Question e where e.marks = :marks";
		Query q = springDataJPA.createQuery(query,Question.class);
		q.setParameter("marks", marks);
		
		@SuppressWarnings("unchecked")
		List<Question> queryOutput = q.getResultList();
		return queryOutput;
	}

	@Override
	public void updateQuestion(int id) {
		
		
	}

}
