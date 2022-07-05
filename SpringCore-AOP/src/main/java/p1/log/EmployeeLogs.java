package p1.log;

import java.time.LocalDate;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import p1.Employee;

@Aspect
@Component
public class EmployeeLogs {

	
	

 @Before("execution(public void doDeposit())")
	public void empSalaryLog()
	{
		LocalDate date = LocalDate.now();
		
		System.err.println(" INFO :- Employe Logs :- "+date);
	}
}
