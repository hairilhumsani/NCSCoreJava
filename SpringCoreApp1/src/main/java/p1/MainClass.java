package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext spring = new ClassPathXmlApplicationContext("ncs-spring-cofg.xml");

		Employee e = (Employee) spring.getBean("full-employee");

		printEmployeeDetails(e);

	}

	public static void printEmployeeDetails(Employee e) {
		System.out.println(e);
		System.out.println(e.getAddress());
	}

}
