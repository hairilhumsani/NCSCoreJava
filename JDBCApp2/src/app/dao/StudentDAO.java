package app.dao;

import java.sql.SQLException;
import java.util.List;

import app.model.Student;


public interface StudentDAO {
	public boolean saveEmployee(Student student)throws SQLException;
	public Student getEmployeeByID(int id);
	public List<Student> getAllEmploye();
	//public Student doLinkProjectWithEmployee(int empId,int projetId);
}
