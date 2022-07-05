package p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.dev.EmployeeDevService;
import p1.dev.Test;

public class MainApplication {

	
	public static void main(String[] args) {
		MainApplication app= new MainApplication();
		
		System.out.println(" \n\n ============  Main Starts ================");
	
		
		
		ApplicationContext spring = new ClassPathXmlApplicationContext("ncs-spring-cofg.xml");
		
		Employee e = (Employee)spring.getBean("employee");
		EmployeeService employeeService = (EmployeeService)spring.getBean("employeeService");
		
		
		EmployeeDevService devService = (EmployeeDevService)spring.getBean("employeeDevService");
		
		
		try {
			devService.doDeposit(e,"Netbanking");
		} catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
	
		
		
	//	app.salaryTransfer(e,employeeService);
		
			
	}
	
	
	
	public  void salaryTransfer(Employee e, EmployeeService employeeService)
	{
		System.out.println(e);
		employeeService.doDeposit();
	
	}
}
