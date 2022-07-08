package com.ncs.empconsole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncs.empconsole.model.Project;
import com.ncs.empconsole.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{
	
	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project addProject(Project p) {
		Project savedEntity  = projectRepository.save(p);
		return savedEntity;
	}

	@Override
	public List<Project> getAllProject() {
		return projectRepository.findAll();
	}

	@Override
	public Project getProjectById(int proId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Project deleteProject(int proId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateProject(int proId) {
		// TODO Auto-generated method stub
		
	}
	
	

}
