package p1.service;

import java.sql.SQLException;

import p1.execptions.InvalidProjectIdException;
import p1.model.Project;

public interface ProjectService {
	
	public Project getProjectById(int projectNumber)throws SQLException;
	public boolean deleteProject(int projectId);
	public boolean addProject(Project p)throws SQLException;

}
