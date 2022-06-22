package p1.service;

import java.sql.SQLException;

import p1.dao.ProjectDAO;
import p1.dao.ProjectDAOImpl;
import p1.execptions.InvalidProjectIdException;
import p1.model.Project;

public class ProjectServiceImpl implements ProjectService {

	ProjectDAO projectDAO;
	
	
	
	public ProjectServiceImpl() {
		projectDAO = new ProjectDAOImpl();
	}



	@Override
	public Project getProjectById(int projectNumber) throws SQLException {
		
		return projectDAO.getProjectById(projectNumber);
	}



	@Override
	public boolean deleteProject(int projectId) {
		return projectDAO.deleteProject(projectId);
	}



	@Override
	public boolean addProkect(Project p) throws SQLException, InvalidProjectIdException {
		
		return projectDAO.addProject(p);
	}
	
	

}
