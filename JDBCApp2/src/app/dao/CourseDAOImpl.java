package app.dao;

import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import app.model.Course;

public class CourseDAOImpl implements CourseDAO {

	Connection con;

	public CourseDAOImpl() {
		con = MySQLConnection.mySql;
	}

	@Override
	public boolean addCourse(Course course) throws SQLException {

		/*
		 * code should be responsible to 1) insert employee into DB 2) return the status
		 * value
		 */

		String query = "insert into course(courseId,courseName,duration,Exams) values(?,?,?,?);";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, course.getCourseId());
		ps.setString(2, course.getCourseName());
		ps.setDate(3, course.getDuration());
		ps.setString(4, course.getExams());

		int rowsEffected = ps.executeUpdate();

		boolean status = (rowsEffected == 1) ? true : false;

		return status;

	}

	@Override
	public Course getCoursebyId(int id) throws SQLException {
		Course output = null;
		String query = "select * from course where courseId = ?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();

		if (rs != null) {
			while (rs.next()) {
				int courseId = rs.getInt(1);
				String name = rs.getString(2);
				Date duration = rs.getDate(3);
				String exams = rs.getString(4);

				output = new Course(courseId, name, duration, exams);

			}
		}

		return output;

	}

	@Override
	public List<Course> getAllCourse() throws SQLException {
		
		Course output = null;
		String query = "select * from course";
		List<Course> course = new ArrayList<>();

		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();

		if (rs != null) {
			while (rs.next()) {
				int courseId = rs.getInt(1);
				String name = rs.getString(2);
				Date duration = rs.getDate(3);
				String exams = rs.getString(4);

				output = new Course(courseId, name, duration, exams);
				course.add(output);

			}
		}

		return course;
	}

	@Override
	public Course getCoursesByName(String courseName) throws SQLException {
		Course output = null;
		String query = "select courseId from course where courseName = ?";

		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, courseName);
		ResultSet rs = ps.executeQuery();

		if (rs != null) {
			while (rs.next()) {
				int courseId = rs.getInt(1);
				String name = rs.getString(2);
				Date duration = rs.getDate(3);
				String exams = rs.getString(4);

				output = new Course(courseId, name, duration, exams);

			}
		}

		return output;
	}

	@Override
	public boolean deleteCourse(int id) {

		boolean isDeleted = false;

		String updateStudentQuery = "update student set enrollCourse = null where enrollCourse = ?";
		String deleteCourseQuery = "delete from course where courseId = ?";
		try {

			con.setAutoCommit(false);

			// update employee table
			PreparedStatement psUpdate = con.prepareStatement(updateStudentQuery);
			psUpdate.setInt(1, id);

			int rowsEffected = psUpdate.executeUpdate();
			System.err.println("INFO : " + LocalTime.now() + " rows effected after update :- " + rowsEffected);

			// delete project table
			PreparedStatement psDelete = con.prepareStatement(deleteCourseQuery);
			psDelete.setInt(1, id);

			int deleteRowsEffected = psDelete.executeUpdate();
			System.err.println("INFO : " + LocalTime.now() + " rows effected after delete :- " + rowsEffected);

			if (rowsEffected != 0 && deleteRowsEffected != 0) {
				con.commit();
				System.err.println("INFO : " + LocalTime.now() + " Data based Commited !!!");
				isDeleted = true;
			}

		} catch (Exception e) {
			try {
				System.err.println("Inside catch Block :- " + e);
				con.rollback();
			} catch (SQLException e1) {
				System.out.println("Exception during roll back " + e);
			}
		}

		return isDeleted;
	}

}
