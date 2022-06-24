package com.ncs.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ncs.model.Course;
import com.ncs.service.CourseService;
import com.ncs.service.CourseServiceImpl;

/**
 * Servlet implementation class AppServlet
 */
public class GetAllEmployeeServlet extends HttpServlet {

	CourseService courseService;
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetAllEmployeeServlet() {
		courseService = new CourseServiceImpl();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String color = (String)request.getAttribute("color");
		
		
		response.setContentType("text/html");
		PrintWriter browser = response.getWriter();

		try {
			
			browser.print(
					"<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n"
							+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\"></script>");
			List<Course> courseList = courseService.getAllCourse();
			browser.print("<body>");
			browser.print("<table class=\"table\">\n" + "<thead class=\"thead thead-dark\">\n" + "  <tr>\n"
					+ "    <th scope=\"col\">#</th>\n" + "<th scope=\"col\">Course Name</th>\n"
					+ "    <th scope=\"col\">Exams</th>\n" + "    <th scope=\"col\">Duration</th>\n"
					+ "    <th scope=\"col\"></th>\n" + "  </tr>\n" + "</thead>");
			browser.print("<tbody>");
			for (Course course : courseList) {
				browser.print("<tr>\n" + "    <th scope=\"row\">" + course.getCourseId() + "</th>\n" + "    <td>"
						+ course.getCourseName() + "</td>\n" + "    <td>" + course.getExams() + "</td>\n" + "    <td>"
						+ course.getDuration() + "</td>\n" + "    <td>"
						+ "<button style=\"background-color:"+color+"\" type=\"button\" class=\"btn btn-outline-primary\">Delete</button>"
						+ "</td>  </tr>");
			}
			browser.print("</tbody>\n" + "</table>");
			browser.print("</body>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

};
