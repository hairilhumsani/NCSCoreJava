package app.ui;

import java.sql.Date;
import java.util.Scanner;

import app.dto.CourseDTO;
import app.model.Course;
import app.model.Student;
import app.service.CourseService;
import app.service.CourseServiceImpl;
import app.service.StudentService;
import app.service.StudentServiceImpl;

public class MainRunner {

	Scanner sc = new Scanner(System.in);
	CourseService courseService;
	StudentService studentService;

	public MainRunner() {
		courseService = new CourseServiceImpl();
		studentService = new StudentServiceImpl();
	}

	public static void main(String[] args) {
		MainRunner app = new MainRunner();

		while (true) {
			System.out.println("\n\n ============== Link Panel =====================");
			System.out.println("1. Insert Course ");
			System.out.println("2. Add Project");
			System.out.println("3. Add Project to E,ployee");
			System.out.println("4. View All Employee");
			System.out.println("5. View Employee By ID ");
			System.out.println("0. EXIT");

			System.out.println("\n Enter Ur Option :- ");
			int userOption = new Scanner(System.in).nextInt();

			switch (userOption) {
			case 1:
				app.saveEmployee();
				break;
				
			case 5:
				app.viewEmployeeetails();
				break;
			case 0:
				System.exit(0);
				
			
			}

		} // end of while
	}

	public void saveEmployee() {
		// code to insert values for Employee

		Course e = new Course(4, "Hairil", Date.valueOf("2022-02-01"), "Yes");
		try {
			boolean status = courseService.addCourse(e);
			if (status == true) {
				System.out.println(e.getCourseId() + " Saved in the Database " + e);
			} else {
				throw new Exception("Unknown SQL Exception ");
			}
		} catch (Exception e2) {
			System.out.println(e2.getMessage() + "\n contact to customer care");
			System.out.println("\n\n care@ncshr.com");
		}

	}

	public void viewEmployeeetails() {
		System.out.println("Enter Course ID to be Searched :- ");
		int searchId = Integer.parseInt(sc.nextLine());

		try {
			Course e = courseService.getCoursebyId(searchId);
			if (e != null) {

				Student s = studentService.getStudentByCourse(e.getCourseId());
				if (s != null) {
					CourseDTO dtoObject = new CourseDTO();
					dtoObject.setCourseId(e.getCourseId());
					;
					dtoObject.setCourseName(e.getCourseName());
					dtoObject.setDuration(e.getDuration());
					dtoObject.setExams(e.getExams());
					dtoObject.setStudentName(s.getName());

					// System.out.println(dtoObject);
					printEmployeeInfo(dtoObject);
				} else {
					CourseDTO dtoObject = new CourseDTO();
					dtoObject.setCourseId(e.getCourseId());
					dtoObject.setCourseName(e.getCourseName());
					dtoObject.setDuration(e.getDuration());
					dtoObject.setExams(e.getExams());
					dtoObject.setStudentName("No student enroll");

					// System.out.println(dtoObject);
					printEmployeeInfo(dtoObject);
				}
			} else {
				System.out.println(" Wrong Course ID !!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception " + e.getMessage());
		}
	}

	public void printEmployeeInfo(CourseDTO dto) {
		System.out.println("______________________________________");
		System.out.println("Course Id :- " + dto.getCourseId());
		System.out.println("Course Name :- " + dto.getCourseName());
		System.out.println("Duration :- " + dto.getDuration());
		System.out.println("Exams :- " + dto.getExams());
		System.out.println("Students :- " + dto.getStudentName());
		System.out.println("************************************************");
	}

}
