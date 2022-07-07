package com.ncs.empconsole.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncs.empconsole.dao.EmployeeDB;
import com.ncs.empconsole.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDB employeeDb;
	
	@Override
	public boolean addEmployee(Employee e) {
		return employeeDb.addEmployee(e);
		
	}

	@Override
	public Employee getEmployeeDetails(int searchedEmpId) {
		
		return employeeDb.getEmployee(searchedEmpId);
	}

	@Override
	public Employee getEmployeeDetails(String searchedEmpName) {
		
		return employeeDb.getEmployee(searchedEmpName);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeDb.getEmployeeDB();
	}

	@Override
	public List<Employee> getAllEmployees(int salaryRange1, int salaryRange2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee updateProject(int searchEmpId, int projectId) {
		
		return EmployeeDB.updateProjectInfo(searchEmpId, projectId);
	}

	@Override
	public Employee getEmployeeByProject(int projectId) {
		
		return EmployeeDB.getEmployeeFromProIDDB(projectId);
		// TODO Auto-generated method stub
	}

	
}
