package com.ncs.empconsole.service;

import java.util.List;

import com.ncs.empconsole.model.Project;

public interface ProjectService {

	public Project addProject (Project p);
	
	public List<Project> getAllProject();
	
	public Project getProjectById(int proId);
	
	public Project deleteProject(int proId);
	
	public void updateProject(int proId);
	
}
