package p3;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NextServlet
 */
public class NextServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		PrintWriter browser = resp.getWriter();
		
		/**    Access Servlet Context which is application scope container **/
		
		ServletContext context = getServletContext();
		String ipAddress = context.getInitParameter("ServerIPAddress");
		
		browser.print("<br/>Context - IP Address :- "+ipAddress+"<br/><br/>");
		
		/**    Access Servlet Config which is Page scope container **/
		ServletConfig config = getServletConfig();
		String mathsTeacherName = config.getInitParameter("MathsTeacherName");
		browser.print("<br/>Config - Maths Teacher Name :- "+mathsTeacherName);
	}

	

}
