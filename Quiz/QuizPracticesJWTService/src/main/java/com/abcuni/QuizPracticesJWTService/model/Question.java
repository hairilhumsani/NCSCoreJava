package com.abcuni.QuizPracticesJWTService.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties("hibernateLazyInitializer")
@Entity
public class Question implements Comparable<Question>, Serializable {

	private static final long serialVersionUID = -1111582199644474917L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;

	private String questionString;
	private String category;
	private int marks;
	private String option1, option2, option3, option4;
	private String correctAnswer;
	
	

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(option1, option2, option3, option4, category, correctAnswer, marks, questionId, questionString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		return Objects.equals(option1, other.option1) && Objects.equals(option2, other.option2) && Objects.equals(option3, other.option3)
				&& Objects.equals(option4, other.option4) && Objects.equals(category, other.category)
				&& Objects.equals(correctAnswer, other.correctAnswer) && marks == other.marks
				&& questionId == other.questionId && Objects.equals(questionString, other.questionString);
	}

	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionString=" + questionString + ", category=" + category
				+ ", marks=" + marks + ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4 + ", correctAnswer="
				+ correctAnswer + "]";
	}

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestionString() {
		return questionString;
	}

	public void setQuestionString(String questionString) {
		this.questionString = questionString;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getoption1() {
		return option1;
	}

	public void setoption1(String option1) {
		this.option1 = option1;
	}

	public String getoption2() {
		return option2;
	}

	public void setoption2(String option2) {
		this.option2 = option2;
	}

	public String getoption3() {
		return option3;
	}

	public void setoption3(String option3) {
		this.option3 = option3;
	}

	public String getoption4() {
		return option4;
	}

	public void setoption4(String option4) {
		this.option4 = option4;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	@Override
	public int compareTo(Question o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
