package com.ncs.service;

import java.sql.SQLException;
import java.util.List;

import com.ncs.dao.CourseDAO;
import com.ncs.dao.CourseDAOImpl;
import com.ncs.model.Course;

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
	public List<Course> getAllCourse() throws SQLException {
		
		List<Course> output = courseDao.getAllCourse();
		// TODO Auto-generated method stub
		return output;
	}

	@Override
	public Course getCoursesByName(String courseName) throws SQLException {
		Course output = courseDao.getCoursesByName(courseName);
		return output;
	}

	@Override
	public boolean deleteCourse(int id) {
		boolean status = courseDao.deleteCourse(id);
		return status;
	}

}
