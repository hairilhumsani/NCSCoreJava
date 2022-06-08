package p5;

public interface EmployeeService {
	
	public Employee[] getAllEmployees(String projectName);
	
	public int getSalary(int empId);
	
	public int getTotalSalaryPaid(String projectName);
	
	public String[] getEmployeeNames(String projectName);

}
