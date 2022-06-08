package p5;

public interface EmployeeService {
	
	public Employee[] getAllEmployees(Project project);
	
	public int getSalary(int empId,Project project);
	
	public int getTotalSalaryPaid(Project project);
	
	public String[] getEmployeeNames(Project project);

}
