package app.service;

import java.sql.SQLException;
import java.util.List;

import app.dao.StudentDAO;
import app.dao.StudentDAOImpl;
import app.model.Student;

public class StudentServiceImpl implements StudentService {
	
	StudentDAO studentdao;
	
	public StudentServiceImpl()
	
	{
		studentdao = new StudentDAOImpl();
	}

	@Override
	public boolean addStudent(Student student) throws SQLException {
		boolean status = studentdao.addStudent(student);
		return status;
	}

	@Override
	public Student getStudentByCourse(int id) throws SQLException {
		
		return studentdao.getStudentByCourse(id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
