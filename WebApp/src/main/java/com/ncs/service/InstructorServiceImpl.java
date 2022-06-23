package com.ncs.service;

import java.sql.SQLException;
import java.util.List;

import com.ncs.dao.InstructorDAO;
import com.ncs.dao.InstructorDAOImpl;
import com.ncs.model.Instructor;

public class InstructorServiceImpl implements InstructorService {
	
	InstructorDAO instructordao;
	
	public InstructorServiceImpl()
	{
		instructordao = new InstructorDAOImpl();
	}

	@Override
	public boolean addInstructor(Instructor instructor) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Instructor getInstructor(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Instructor> getAllIntructors() throws SQLException {
		List<Instructor> output = instructordao.getAllIntructors();
		return output;
	}

}
