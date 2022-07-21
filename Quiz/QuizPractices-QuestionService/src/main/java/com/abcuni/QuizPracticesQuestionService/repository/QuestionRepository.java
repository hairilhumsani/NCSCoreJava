package com.abcuni.QuizPracticesQuestionService.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.abcuni.QuizPracticesQuestionService.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer>, CustomQuestionRepository {

}
