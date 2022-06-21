package app.model;

import java.util.Objects;

public class Student {

	private int studentId;
	private String name;
	private String email;
	private int enrollCourse;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEnrollCourse() {
		return enrollCourse;
	}
	public void setEnrollCourse(int enrollCourse) {
		this.enrollCourse = enrollCourse;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, enrollCourse, name, studentId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && enrollCourse == other.enrollCourse
				&& Objects.equals(name, other.name) && studentId == other.studentId;
	}
	
	
	
	
	
	
}
