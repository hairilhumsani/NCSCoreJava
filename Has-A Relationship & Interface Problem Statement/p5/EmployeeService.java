package p5;

public interface EmployeeService {
	
	public Employee[] getAllEmployees(Project project);
	
	public int getSalary(Project project);
	
	public int getTotalSalaryPaid(int empId , Project project);
	
	public String[] getEmployeeNames(Project project);

}
