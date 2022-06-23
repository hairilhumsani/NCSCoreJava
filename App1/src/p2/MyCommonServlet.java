package p2;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class MyCommonServlet
 */
public class MyCommonServlet extends GenericServlet {
	
	ServletConfig config; // ?

	//below methods are the part of Servlet life cycle
	
	// 1st method to be called , called only once when application deployed on Server
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config = config;
		System.out.println("1)  Inside init method");
	}
	
	// 2nd method to be called , called always whenever user request the resource
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("2) Inside service method");
		
	}
	
	// 3rd method to be called , called once whenever application undeployed from server
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("3) Inside destroy method");
	}

	

	
	

}
