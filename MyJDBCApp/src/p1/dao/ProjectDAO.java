package p1.dao;

import java.sql.SQLException;

import p1.execptions.InvalidProjectIdException;
import p1.model.Project;

public interface ProjectDAO {
	
	public boolean addProject(Project p)throws SQLException, InvalidProjectIdException;
	public Project getProjectById(int projectId)throws SQLException;
	public boolean deleteProject(int projectId);

}
