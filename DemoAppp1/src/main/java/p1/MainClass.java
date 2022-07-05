package p1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
public static void main(String[] args) {
		ApplicationContext spring = new ClassPathXmlApplicationContext("annotation-spring-config.xml");
		Order o = (Order)spring.getBean("order");
		
		int productPrice = o.getGrossOrderAmount();
		Payment paymentType = o.getModeOfPayment();
		int finalAmount = paymentType.doPayment(productPrice);
		
		o.setFinalOrderAmount(finalAmount);
		
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
