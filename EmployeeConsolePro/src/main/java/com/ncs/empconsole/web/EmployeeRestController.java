package com.ncs.empconsole.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.empconsole.model.Employee;
import com.ncs.empconsole.service.EmployeeService;

@RestController
@RequestMapping("/empconsole/emp")
public class EmployeeRestController {
	
	@Autowired
	EmployeeService empService;
	
	public EmployeeRestController() {
		System.out.println(" Employee Controller constructor called");
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e)
	{
		
		System.err.println(" -->> 1) From Web :- "+e);
		boolean status = empService.addEmployee(e);
		System.err.println(" -->> 4) add employee Rest controller status :- "+status);
		return (status == true)?e:null;
	}
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees()
	{
		return empService.getAllEmployees();
	}
	
	@GetMapping("/employee/id/{id}")
	public Employee getEmployeeById(@PathVariable int id)
	{
		System.out.println("path varible : "+id);
		return empService.getEmployeeDetails(id);
	}
	
	@DeleteMapping("/employee/id/{emp_id}")
	public void deleteEmployeeById(@PathVariable int emp_id)
	{
		System.out.println("path varible : "+emp_id);
		empService.deleteProject(emp_id);
	}

}
