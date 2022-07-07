package com.ncs.empconsole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ncs.empconsole.model.Employee;
import com.ncs.empconsole.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public boolean addEmployee(Employee e) {
		Employee savedEntity =  employeeRepository.save(e);
		
		if(savedEntity!=null) return true;
		else return false;
		
	}

	@Override
	public Employee getEmployeeDetails(int searchedEmpId) {
		
		Employee returnedEmployee =  employeeRepository.getById(searchedEmpId);
		
		 return (returnedEmployee!=null)? returnedEmployee : null;
	}

	@Override
	public Employee getEmployeeDetails(String searchedEmpName) {
		
		return null;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getAllEmployees(int salaryRange1, int salaryRange2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateProject(int searchEmpId, int projectId) {
		
		return null;
	}

	
}
