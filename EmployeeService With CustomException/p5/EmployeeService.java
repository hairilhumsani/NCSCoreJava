package p5;

public interface EmployeeService {
	                                    // String projectName
	public Employee[] getAllEmployees(Project project);
	
	public int getSalary(int empId,Project project);
	
	public int getTotalSalaryPaid(Project project);
	
	public String[] getEmployeeNames(Project project);
	
	/*
	public Employee[] getAllDevelopers(Project project);
	public Employee[] getAllManagers(Project project);
	public Employee[] getTotalSalaryByTypeOfEmployee(Project project,String designation);
	
	*/

}
