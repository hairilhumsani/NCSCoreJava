package app.dao;

import java.sql.SQLException;
import java.util.List;

import app.model.Course;

public interface CourseDAO {
	public boolean addCourse(Course course)throws SQLException;
	public Course getCoursebyId(int id) throws SQLException;
	public List<Course> getAllCourse() throws SQLException;
	public Course getCoursesByName(String courseName) throws SQLException;
	public boolean deleteCourse(int id);
	//public Student doLinkProjectWithEmployee(int empId,int projetId);
}
