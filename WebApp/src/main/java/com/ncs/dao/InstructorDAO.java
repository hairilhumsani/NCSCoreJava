package com.ncs.dao;

import java.sql.SQLException;
import java.util.List;

import com.ncs.model.Instructor;

public interface InstructorDAO {
	public boolean addInstructor (Instructor instructor)throws SQLException;
	public Instructor getInstructor(int id);
	public List<Instructor> getAllIntructors() throws SQLException;
	// public Instructor doLinkProjectWithEmployee(int empId,int projetId);
}
