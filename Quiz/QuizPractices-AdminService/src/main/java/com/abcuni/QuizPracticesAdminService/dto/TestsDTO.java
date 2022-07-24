package com.abcuni.QuizPracticesAdminService.dto;

import org.springframework.stereotype.Component;

@Component
public class TestsDTO {

	private int testId;
	private UsersDTO userId;

	private String date;
	private String category;
	private String level;
	private int totalScore;
	private int marks;

	public int getTestId() {
		return testId;
	}

	public void setTestId(int testId) {
		this.testId = testId;
	}

	public UsersDTO getUserId() {
		return userId;
	}

	public void setUserId(UsersDTO userId) {
		this.userId = userId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public TestsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TestsDTO [testId=" + testId + ", userId=" + userId + ", date=" + date + ", category=" + category
				+ ", level=" + level + ", totalScore=" + totalScore + ", marks=" + marks + "]";
	}

}
