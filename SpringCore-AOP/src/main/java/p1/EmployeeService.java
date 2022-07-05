package p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import p1.log.EmployeeLogs;

@Component
public class EmployeeService {

	@Autowired
	EmployeeLogs employeeLogs;
	
	
	
	public EmployeeService() {
		System.out.println(" Inside constructor employee Service ");
	}



	public void doDeposit() // Business Operation
	{
		
		
		// --------------------------------------------------------------------
		System.out.println("Salary Credited to the Employee Bank ");
		System.out.println("Data saved in Database , employee notified too.");
	}
	
}

