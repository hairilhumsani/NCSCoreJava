package com.ncs.empconsole.repository;

import java.util.List;

import com.ncs.empconsole.model.Project;

public interface CustomProjectRepository {
	
	public Project getProjectById(int empId);
	
	public boolean updateProjectDetails(); 
	
	public boolean deleteProjectDetails();
	
}
