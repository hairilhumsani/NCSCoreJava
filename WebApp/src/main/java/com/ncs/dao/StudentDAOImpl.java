package com.ncs.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.List;
import java.sql.Connection;

import com.ncs.model.Student;

public class StudentDAOImpl implements StudentDAO {

	Connection con;

	public StudentDAOImpl() {
		con = MySQLConnection.mySql;
	}

	@Override
	public boolean addStudent(Student student) throws SQLException {
		String query = "insert into student (studentId, name, email, enrollCourse, location ) values (?,?,?,?,?);";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, student.getStudentId());
		ps.setString(2, student.getName());
		ps.setString(3, student.getEmail());
		ps.setInt(4, student.getEnrollCourse());
		ps.setString(5, student.getLocation());

		int rowsEffected = ps.executeUpdate();

		boolean status = (rowsEffected == 1) ? true : false;

		return status;

	}

	@Override
	public Student getStudentByCourse(int id) throws SQLException {
		Student outputStudent = null;

		String query = "select * from student where enrollCourse = ?"; // DQL
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			String studentName = rs.getString(2);
			// String studentEmail = rs.getString("email");

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
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteStudent(int id) throws SQLException {
		return false;

	}
}
