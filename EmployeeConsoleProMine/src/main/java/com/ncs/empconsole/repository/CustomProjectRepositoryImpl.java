package com.ncs.empconsole.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.ncs.empconsole.model.Employee;
import com.ncs.empconsole.model.Project;

public class CustomProjectRepositoryImpl implements CustomProjectRepository{
	
	@Autowired
	EntityManager springDataJPA;


	@Override
	public Project getProjectById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateProjectDetails() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteProjectDetails() {
		// TODO Auto-generated method stub
		return false;
	}

}
