package p1.dao;

import java.sql.SQLException;
import java.util.List;

import p1.model.Employee;

public interface EmployeeDAO {
	public boolean saveEmployee(Employee e)throws SQLException;
	public Employee getEmployeeByID(int id);
	public List<Employee> getAllEmploye();
	public Employee doLinkProjectWithEmployee(int empId,int projetId);
}
