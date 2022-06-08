package p5;

/* code starts from main class only*/

public class MainClass implements EmployeeService{
	
	public Project getSampleRecord()
	{
		Project p1 = new Project();
		p1.setProjectName("MyBankApp");
		
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setName("A");
		e1.setSalary(2000);
		
		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setName("B");
		e2.setSalary(6000);
		
		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setName("C");
		e3.setSalary(2800);
		
		Employee e4 = new Employee();
		e4.setEmpId(4);
		e4.setName("D");
		e4.setSalary(3000);
		
		Employee resourceTeam1[] = new Employee[3];
		resourceTeam1[0] = e1;
		resourceTeam1[1] = e2;
		resourceTeam1[2] = e3;
			
		p1.setResourceTeam(resourceTeam1);
	
		return p1;
	}
	
	public static void main(String[] args) {
		
		MainClass obj = new MainClass();
		
		Project project = obj.getSampleRecord();
		// --------------------------- ----------------------------------
		// 		Calling implementation methods 
		
		// 1. 
		System.out.println(" List of All Employees works in Project "+project.getProjectName());
		Employee arr[] = obj.getAllEmployees(project);
		for (Employee employee : arr) {
			obj.displayEmployeeInfo(employee);
		}
		
		// 2. 
		int salary = obj.getSalary(2, project);
		System.out.println(" salary is "+salary);
		
		// 3. 
		int totalSalaryPaid = obj.getTotalSalaryPaid(project);
		System.out.println("Total Salary cost "+totalSalaryPaid);

		String[] getAllName = obj.getEmployeeNames(project);
		for (String lol : getAllName)
		{
			System.out.println(lol);
		}
		
	}

	public void displayEmployeeInfo(Employee e)
	{
		System.out.println("\n"+e.getEmpId()+" - "+e.getName()+" -  "+e.getSalary());
	}
	
	
	@Override
	public Employee[] getAllEmployees(Project project) {
		return project.getResourceTeam();
	}

	@Override
	public int getSalary(int empId, Project project) {
		
		Employee listofEmployees[] = getAllEmployees(project);
		
		for (Employee employee : listofEmployees) {
			if(employee.getEmpId() == empId)
			{
				return employee.getSalary();
			}
		}
		
		return 0;
	}

	@Override
	public int getTotalSalaryPaid(Project project) {
		Employee listofEmployees[] = getAllEmployees(project);
		
		int totalSalary = 0;
		for (Employee employee : listofEmployees) {
			totalSalary += employee.getSalary();
		}
		
		return totalSalary;
	}

	@Override
	public String[] getEmployeeNames(Project project) {

		Employee[] employees = getAllEmployees(project);
		String allnames[] = new String[employees.length];

		int pos = 0;
		for (Employee employee : employees)
		{
			allnames[pos++] = employee.getName();
		}

		
		return allnames;
	}

	
	
}//end class


/*
 * Requirement 
 * 1) Implement all the methods of EmployeeService interface and
 * 2) render the output in main method, which comes from implemented method
 * 
 * */
