package p1.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;

import p1.Employee;
import p1.log.EmployeeLogs;



@Component
public class EmployeeDevService {

	@Autowired
	EmployeeLogs employeeLogs;
	
	
	
	public int doDeposit(Employee e,String paymentMode) // Business Operation
		throws Exception
	{
		
		
		// --------------------------------------------------------------------
		System.out.println("EmployeeDevService doDeposit method :-  "+e);
		System.out.println("Data saved in Database , employee notified too.");
		
		if(e.getSalary()>1000)
		{
			throw new Exception("Salary is more than 100");
		}
		
		return e.getSalary();
	}
	
}

