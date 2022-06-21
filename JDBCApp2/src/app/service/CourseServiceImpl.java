package app.service;

import java.sql.SQLException;
import java.util.List;

import app.dao.CourseDAO;
import app.dao.CourseDAOImpl;
import app.model.Course;

public class CourseServiceImpl implements CourseService{
	
	CourseDAO courseDao;
	
	public CourseServiceImpl()
	{
		courseDao = new CourseDAOImpl();
	}

	@Override
	public boolean addCourse(Course course) throws SQLException {
		// TODO Auto-generated method stub
		boolean status = courseDao.addCourse(course);
		return status;
	}

	@Override
	public Course getCoursebyId(int id) throws SQLException {
		// TODO Auto-generated method stub
		Course output = courseDao.getCoursebyId(id);
		return output;
	}

	@Override
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}

}
