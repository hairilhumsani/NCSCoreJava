package app.dto;

import java.sql.Date;

public class CourseDTO {

	private int courseId;
	private String courseName;
	private Date duration;
	private String exams;
	private String studentName;

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

	public CourseDTO(int courseId, String courseName, Date duration, String exams) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.exams = exams;
	}

	public CourseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CourseDTO [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration + ", exams="
				+ exams + "]";
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

}
