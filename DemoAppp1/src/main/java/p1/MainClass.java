package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	
public static void main(String[] args) {
		CashPayment cashPayment = new CashPayment();
		ApplicationContext spring = new ClassPathXmlApplicationContext("annotation-spring-config.xml");
		Order o = (Order)spring.getBean("order");
		
		o.setFinalOrderAmount(cashPayment.doPayment(400));
		
		printOrderDetails(o);
		
	
		
		
		
	}
	
	public static void printOrderDetails(Order o)
	{
		System.out.println(o.getGrossOrderAmount());
		System.out.println(o.getFinalOrderAmount());
		//System.out.println(o.getGrossOrderAmount());
		//System.out.println(e.getEmployeeInsurance().getSumAssuredAmount());
		
	}

}
