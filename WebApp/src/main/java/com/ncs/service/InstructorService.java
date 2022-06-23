package com.ncs.service;

import java.sql.SQLException;
import java.util.List;

import com.ncs.model.Instructor;

public interface InstructorService {
	public boolean addInstructor (Instructor instructor)throws SQLException;
	public Instructor getInstructor(int id);
	public List<Instructor> getAllIntructors() throws SQLException;
	// public Instructor doLinkProjectWithEmployee(int empId,int projetId);
}
