package p5;

/* code starts from main class only*/

public class MainClass implements EmployeeService {
	Project arr[] = new Project[3];

	public Project[] getSampleRecord() throws EmployeeCountException {
		
		// sample data for 1 project

		Project p1 = new Project();
		p1.setProjectName("Bank Application Project");

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

		if (resourceTeam1.length <= 0 || resourceTeam1 == null) {
			throw new EmployeeCountException(p1);
		} else {
			p1.setResourceTeam(resourceTeam1);
		}

		// sample data for 2nd project
		Project p2 = new Project();
		p2.setProjectName(" Car Application Project ");
		
		Employee resourceTeam2[] = new Employee[0];
		if (resourceTeam2.length <= 0 || resourceTeam2 == null) {
			// EmployeeCountException exe = new EmployeeCountException();
			throw new EmployeeCountException(p2);
		} else {
			p2.setResourceTeam(resourceTeam1);
		}

		// sample data for 3rd project

		// add project in the array
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = null;
		return arr;
	}

	public static void main(String[] args) {

		MainClass obj = new MainClass();
		try {
			Project projects[] = obj.getSampleRecord();
			allCode(obj,projects);

		} catch (EmployeeCountException e) {
			System.out.println(e.getMsg());
		}

		// --------------------------- ----------------------------------
		// Calling implementation methods

		// 1.

	}

	public static void allCode(MainClass obj,Project projects[]) {
		
		for (Project project : projects) {

			System.out.println(" ------------------------------------------------------------");
			if (project != null) {
				System.out.println(" List of All Employees works in Project " + project.getProjectName());
				Employee arr[] = obj.getAllEmployees(project);
				for (Employee employee : arr) {
					obj.displayEmployeeInfo(employee);
				}

				// 2.
				int salary = obj.getSalary(12, project);
				System.out.println(" salary is " + salary);

				// 3.
				int totalSalaryPaid = obj.getTotalSalaryPaid(project);
				System.out.println("Total Salary cost " + totalSalaryPaid);

				// 4

				String allNames[] = obj.getEmployeeNames(project);
				for (String name : allNames) {
					System.out.println(name);
				}
			} // end if

		} // end of for projects
	}

	public void displayEmployeeInfo(Employee e) {
		System.out.println("\n " + e.getEmpId() + " -  " + e.getName() + " - " + e.getSalary());
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

		// extract all employees
		Employee listofEmployees[] = getAllEmployees(project);

		// create temporary array for storing names of employee
		String allNames[] = new String[listofEmployees.length];

		/*
		 * int pos = -1; for (Employee employee : listofEmployees) { allNames[++pos]
		 * =employee.getName(); }
		 */

		/*
		 * int index = 0; while(index<listofEmployees.length) { allNames[index]
		 * =listofEmployees[index].getName(); index++; }
		 */

		// iterating over all employee records
		for (int i = 0; i < listofEmployees.length; i++) {
			// extract name from each employee and store in temporary array location
			allNames[i] = listofEmployees[i].getName();
		}

		return allNames; // return temporary array which stores the name only

	}

}// end class

/*
 * Requirement 1) Implement all the methods of EmployeeService interface and 2)
 * render the output in main method, which comes from implemented method
 * 
 */
