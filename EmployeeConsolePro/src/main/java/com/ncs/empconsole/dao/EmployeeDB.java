package com.ncs.empconsole.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ncs.empconsole.model.Employee;

@Component
public class EmployeeDB {
	
	public static List<Employee> employeeDB = new ArrayList<>();

	static
	{
		Employee e1 = new Employee(101, "Ramesh", 2000);
		Employee e2 = new Employee(102, "Suresh", 3000);
		Employee e3 = new Employee(103, "Mahesh", 1500);
		Employee e4 = new Employee(104, "Rakesh", 7000);
	
		employeeDB = Arrays.asList(e1,e2,e3,e4);
	}

	public static boolean addEmployee(Employee e)
	{
		return employeeDB.add(e);
		
	}
	
	public static Employee getEmployee(int id)
	{
		List<Employee> list =   employeeDB.stream().filter((e)->{
			if(e.getEmpId() == id)
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
		
		if(list.size()==1)	return list.get(0);
		else return null;
		
	}
	
	public static Employee getEmployee(String name)
	{
		List<Employee> list =   employeeDB.stream().filter((e)->{
			if(e.getName().equalsIgnoreCase(name))
			{
				return true;
			}
			else return false;
		}).collect(Collectors.toList());
		
		if(list.size()==1)	return list.get(0);
		else return null;
		
	}
	public static List<Employee> getEmployeeDB() {
		return employeeDB;
	}

	public static void setEmployeeDB(List<Employee> employeeDB) {
		EmployeeDB.employeeDB = employeeDB;
	}
	
	
	
}
