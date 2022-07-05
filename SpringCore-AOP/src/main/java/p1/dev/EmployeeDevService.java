package p1.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import p1.log.EmployeeLogs;

@Component
public class EmployeeDevService {

	@Autowired
	EmployeeLogs employeeLogs;
	
	
	
	public EmployeeDevService() {
		System.out.println(" Inside constructor employee Service ");
	}



	public void doDeposit() // Business Operation
	{
		
		
		// --------------------------------------------------------------------
		System.out.println("Salary Credited to the Employee Bank ");
		System.out.println("Data saved in Database , employee notified too.");
	}
	
}

