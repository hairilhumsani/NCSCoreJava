package app.ui;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import app.dto.CourseDTO;
import app.model.Course;
import app.model.Instructor;
import app.model.Student;
import app.service.CourseService;
import app.service.CourseServiceImpl;
import app.service.InstructorService;
import app.service.InstructorServiceImpl;
import app.service.StudentService;
import app.service.StudentServiceImpl;

public class MainRunner {

	Scanner sc = new Scanner(System.in);
	Scanner scInt = new Scanner(System.in);
	Scanner scLocation = new Scanner(System.in);

	CourseService courseService;
	StudentService studentService;
	InstructorService instructorService;

	public MainRunner() {
		courseService = new CourseServiceImpl();
		studentService = new StudentServiceImpl();
		instructorService = new InstructorServiceImpl();
	}

	public static void main(String[] args) {
		MainRunner app = new MainRunner();

		while (true) {
			System.out.println("\n\n ============== Link Panel =====================");
			System.out.println("1. Insert Course ");
			System.out.println("2. Insert Student");
			System.out.println("3. Add Student to Course");
			System.out.println("4. View All Course");
			System.out.println("5. View Course By ID and the student");
			System.out.println("6. Delete Course");
			System.out.println("0. EXIT");

			System.out.println("\n Enter Ur Option :- ");
			int userOption = new Scanner(System.in).nextInt();

			switch (userOption) {
			case 1:
				app.saveEmployee();
				break;

			case 3:
				app.addStudentToCourse();
				break;

			case 4:
				app.getAllCourse();
				break;

			case 5:
				app.viewEmployeeetails();
				break;

			case 6:
				app.doDeleteCourse();
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

	public void getAllCourse() {
		List<Course> course;

		try {
			course = courseService.getAllCourse();
			System.out.println(course);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addStudentToCourse() {

		List<Course> course;
		List<Instructor> instructor;

		try {
			System.out.println("Getting Courses.....");
			course = courseService.getAllCourse();
			for (Course courses : course) {
				System.out.println(courses);
			}

			System.out.println("Getting Instructors Locations.....");

			instructor = instructorService.getAllIntructors();
			for (Instructor instructors : instructor) {
				System.out.println(instructors.getLocation());
			}

			System.out.println("Add student details");
			System.out.println("studentId?");
			int studentId = scInt.nextInt();
			System.out.println("Name?");
			String name = sc.nextLine();
			System.out.println("Email?");
			String email = sc.nextLine();
			System.out.println("Course Id");
			int courseId = sc.nextInt();
			System.out.println("location");
			String location = scLocation.nextLine();

			Student student = new Student(6, "hairil", "email", 4, "Singapore");
			boolean status = studentService.addStudent(student);
			if (status == true) {
				System.out.println(student.getStudentId() + " Saved in the Database " + student);
			} else {
				throw new Exception("Unknown SQL Exception ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doDeleteCourse() {
		System.out.println("Enter Project Number to be Deleted :- ");
		int courseId = Integer.parseInt(sc.nextLine());

		boolean status = courseService.deleteCourse(courseId);
		System.out.println(status);
	}

}
