package app.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;

import app.model.Student;


public class StudentDAOImpl implements StudentDAO{
	
	Connection con;

	
	public StudentDAOImpl()
	{
		con = MySQLConnection.mySql;
	}
	@Override
	public boolean addStudent(Student student) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student getStudentByCourse(int id) throws SQLException {
Student outputStudent = null;
		
		String query = "select * from student where enrollCourse = ?"; // DQL 
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			String studentName = rs.getString(2);
			//String studentEmail = rs.getString("email");
		
			outputStudent = new Student();
			outputStudent.setName(studentName);
		}
		
		
		return outputStudent;
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllEmploye() {
		// TODO Auto-generated method stub
		return null;
	}

}
