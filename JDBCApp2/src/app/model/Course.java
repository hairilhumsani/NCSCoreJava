package app.model;

import java.sql.Date;
import java.time.LocalDate;

public class Course {

	private int courseId;
	private String courseName;
	private Date duration;
	private String exams;

	public Course(int courseId, String courseName, Date duration, String exams) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.exams = exams;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getExams() {
		return exams;
	}

	public void setExams(String exams) {
		this.exams = exams;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", exams="
				+ exams + "]";
	}
	
	

}
