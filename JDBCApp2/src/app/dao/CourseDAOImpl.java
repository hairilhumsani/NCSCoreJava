package app.dao;

import java.sql.SQLException;
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
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

}
