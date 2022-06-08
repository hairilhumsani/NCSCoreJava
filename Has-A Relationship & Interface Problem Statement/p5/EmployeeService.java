package p5;

public interface EmployeeService {
	
	public Employee[] getAllEmployees(Project project);
	
	public int getSalary(int empId);
	
	public int getTotalSalaryPaid(Project pro);
	
	public String[] getEmployeeNames(String projectName);

}
