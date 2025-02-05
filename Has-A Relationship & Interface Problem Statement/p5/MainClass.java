package p5;

/* code starts from main class only*/

public class MainClass implements EmployeeService {

	public Project[] getSampleRecord() {
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

		Project p2 = new Project();
		p2.setProjectName("MyBankApp2");

		Employee f1 = new Employee();
		f1.setEmpId(1);
		f1.setName("A");
		f1.setSalary(2000);

		Employee f2 = new Employee();
		f2.setEmpId(2);
		f2.setName("B");
		f2.setSalary(6000);

		Employee f3 = new Employee();
		f3.setEmpId(3);
		f3.setName("C");
		f3.setSalary(2800);

		Employee f4 = new Employee();
		f4.setEmpId(4);
		f4.setName("D");
		f4.setSalary(3000);

		Employee resourceTeam2[] = new Employee[3];
		resourceTeam2[0] = f1;
		resourceTeam2[1] = f2;
		resourceTeam2[2] = f3;

		p2.setResourceTeam(resourceTeam2);

		Project[] project = new Project[2];
		project[0] = p1;
		project[1] = p2;
		return project;
	}

	public static void main(String[] args) {

		MainClass obj = new MainClass();

		Project[] project = obj.getSampleRecord();
		// --------------------------- ----------------------------------
		// Calling implementation methods

		// 1.
		
		for (Project p : project)
		{
			System.out.println(" List of All Employees works in Project " + p.getProjectName());
			Employee arr[] = obj.getAllEmployees(p);
			for (Employee employee : arr) {
				obj.displayEmployeeInfo(employee);
			}

			// 2.
			int salary = obj.getSalary(2, p);
			System.out.println(" salary is " + salary);

			// 3.
			int totalSalaryPaid = obj.getTotalSalaryPaid(p);
			System.out.println("Total Salary cost " + totalSalaryPaid);

			String[] getAllName = obj.getEmployeeNames(p);
			for (String lol : getAllName) {
				System.out.println(lol);
			}
		}
		

	}

	public void displayEmployeeInfo(Employee e) {
		System.out.println("\n" + e.getEmpId() + " - " + e.getName() + " -  " + e.getSalary());
	}

	@Override
	public Employee[] getAllEmployees(Project project) {
		return project.getResourceTeam();
	}

	@Override
	public int getSalary(int empId, Project project) {

		Employee listofEmployees[] = getAllEmployees(project);

		for (Employee employee : listofEmployees) {
			if (employee.getEmpId() == empId) {
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
		for (Employee employee : employees) {
			allnames[pos++] = employee.getName();
		}

		return allnames;
	}

}// end class

/*
 * Requirement 1) Implement all the methods of EmployeeService interface and 2)
 * render the output in main method, which comes from implemented method
 * 
 */
