package com.ncs.service;

import java.sql.SQLException;
import java.util.List;

import com.ncs.model.Student;

public interface StudentService {
	public boolean addStudent(Student student)throws SQLException;
	public Student getStudentByCourse(int id) throws SQLException;
	public Student getStudentById(int id);
	public List<Student> getAllStudent();
	//public Student doLinkProjectWithEmployee(int empId,int projetId);
}
