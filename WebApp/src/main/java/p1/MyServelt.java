package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class MyServelt
 */
public class MyServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter browser = response.getWriter();
		
		browser.print("<b><u>Welcome to my house</u></b>");
		
		String strX = request.getParameter("x");
		String strY = request.getParameter("y");
		
		int x = Integer.parseInt(strX);
		int y = Integer.parseInt(strY);
		
		int sum = x + y;
		
		browser.print("<br><hr>Sum of </b>" + sum );
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
