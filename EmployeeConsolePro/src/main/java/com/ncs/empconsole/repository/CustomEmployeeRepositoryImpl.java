package com.ncs.empconsole.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.ncs.empconsole.model.Employee;

public class CustomEmployeeRepositoryImpl implements CustomEmployeeRepository{

	@Autowired
	EntityManager springDataJPA;
	// Session in hibernate 
	
	
	@Override
	public Employee getEmployeeDetails(String searchedEmpName) {
		
			
		String query = "from Employee e where e.name = :searchName";
		Query q = springDataJPA.createQuery(query,Employee.class);
		q.setParameter("searchName", searchedEmpName);
		
		Employee queryOutput = (Employee) q.getSingleResult();
		return queryOutput;
	}

	@Override
	public List<Employee> getAllEmployees(int salaryRange1, int salaryRange2) {
		// TODO Auto-generated method stub
		
		// q.getResultList();
		return null;
	}

	@Override
	public Employee updateProject(int searchEmpId, int projectId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
