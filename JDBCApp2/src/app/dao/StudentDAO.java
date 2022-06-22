package app.dao;

import java.sql.SQLException;
import java.util.List;

import app.model.Student;


public interface StudentDAO {
	public boolean addStudent(Student student)throws SQLException;
	public Student getStudentByCourse(int id) throws SQLException;
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	public boolean deleteStudent(int id) throws SQLException;
	//public Student doLinkProjectWithEmployee(int empId,int projetId);
}
