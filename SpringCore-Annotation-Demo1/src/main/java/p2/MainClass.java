package p2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import p1.Employee;

public class MainClass {


	public static void main(String[] args) {
		
		ApplicationContext spring = new AnnotationConfigApplicationContext(MyJavaConf.class);
		Employee e = (Employee)spring.getBean("getEmployee");
		
		printEmployeeDetails(e);
		
		
	}
	
	public static void printEmployeeDetails(Employee e)
	{
		System.out.println(e);
		
		/*System.out.println(e.getEmployeeInsurance().getSumAssuredAmount());
		*/
	}

}
