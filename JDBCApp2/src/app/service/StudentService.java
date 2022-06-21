package app.service;

import java.sql.SQLException;
import java.util.List;

import app.model.Student;

public interface StudentService {
	public boolean addStudent(Student student)throws SQLException;
	public Student getStudentByCourse(int id) throws SQLException;
	public Student getStudentById(int id);
	public List<Student> getAllEmploye();
	//public Student doLinkProjectWithEmployee(int empId,int projetId);
}
