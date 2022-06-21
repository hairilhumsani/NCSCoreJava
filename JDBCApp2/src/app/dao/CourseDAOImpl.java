package app.dao;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;

import java.sql.PreparedStatement;

import app.model.Course;

public class CourseDAOImpl implements CourseDAO {
	
	Connection con;
	
	public CourseDAOImpl()
	{
		con = MySQLConnection.mySql;
	}

	@Override
	public boolean addCourse(Course course) throws SQLException {
		
		/* code should be responsible to 
		 * 1) insert employee into DB 
		 * 2) return the status value*/
		
		String query = "insert into course(courseId,courseName,duration,Exams) values(?,?,?,?);";
		
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, course.getCourseId());
		ps.setString(2, course.getCourseName());
		ps.setDate(3,course.getDuration());
		ps.setString(4, course.getExams());
		
		int rowsEffected = ps.executeUpdate();
		
		boolean status = (rowsEffected == 1)?true:false;
		
		return status;
		
	}

	@Override
	public Course getCoursebyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

}
