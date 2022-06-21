package p1.dao;

import java.sql.SQLException;

import p1.model.Project;

public interface ProjectDAO {
	
	public boolean addProject(Project p);
	public Project getProjectById(int projectId)throws SQLException;

}
