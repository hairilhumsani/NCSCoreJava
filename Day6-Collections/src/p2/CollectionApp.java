package p2;

import java.util.ArrayList;
import java.util.List;

public class CollectionApp {
	
	List<Employee> employees = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		CollectionApp app = new CollectionApp();
		app.insertIntoCollection();
		app.displayEmployees();
		
	}
	
	public void insertIntoCollection()
	{
		Employee e1 = EmployeeFactory.getEmployee("Abc", 5800, "Accountant");
		Employee e2 = EmployeeFactory.getEmployee("xyz", 8800, "Developer");
		Employee e3 = EmployeeFactory.getEmployee("pqr", 4800, "Accountant");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		
	}
	
	public void displayEmployees()
	{
		
		for (Employee employee : employees) {
			System.out.println("\n\n"+employee);
			
			
			employee.setSalary((int)(employee.getSalary()*1.10)); // command behavior for all employees
			
			// calling sepecfic behaviour of all employees
			if(employee instanceof Accountant)
			{
				Accountant a = (Accountant)employee;
				a.doSalaryThings();
				
			}
			
			if(employee instanceof Developer)
			{
				
				Developer dev = (Developer)employee;
				dev.submitProject();
				
			}
			System.out.println("\n Salary Updated :- "+employee);
		}
	}
	
	
	

}
