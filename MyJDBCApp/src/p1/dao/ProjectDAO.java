package p1.dao;

import p1.model.Project;

public interface ProjectDAO {
	
	public boolean addProject(Project p);
	public Project getProjectById(int projectId);

}
