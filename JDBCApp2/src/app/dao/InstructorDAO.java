package app.dao;

import java.sql.SQLException;
import java.util.List;

import app.model.Instructor;

public interface InstructorDAO {
	public boolean addInstructor (Instructor instructor)throws SQLException;
	public Instructor getInstructor(int id);
	public List<Instructor> getAllIntructors();
	// public Instructor doLinkProjectWithEmployee(int empId,int projetId);
}
