package app.ui;

import java.sql.Date;
import java.util.Scanner;

import app.model.Course;
import app.service.CourseService;
import app.service.CourseServiceImpl;

public class MainRunner {
	
	Scanner sc = new Scanner(System.in);
	CourseService courseService;

	public MainRunner()
	{
		courseService = new CourseServiceImpl();
	}
	public static void main(String[] args) {
MainRunner app = new MainRunner();
		
		while(true)
		{
			System.out.println("\n\n ============== Link Panel =====================");
			System.out.println("1. Insert Employee ");
			System.out.println("2. Add Project");
			System.out.println("3. Add Project to E,ployee");
			System.out.println("4. View All Employee");
			System.out.println("5. View Employee By ID ");
			System.out.println("0. EXIT");
			
			System.out.println("\n Enter Ur Option :- ");
			int userOption = new Scanner(System.in).nextInt();
			
			switch(userOption)
			{
				case 1:
						app.saveEmployee();
						break;
				case 0:
					System.exit(0);
			}
			
		}//end of while
	}
	
	
	public void saveEmployee()
	{
		// code to insert values for Employee
		
		Course e = new Course(4,"Hairil",Date.valueOf("2022-02-01"),"Yes");
		try {
			boolean status = courseService.addCourse(e);
			if(status == true)
			{
				System.out.println(e.getCourseId()+" Saved in the Database "+e);
			}
			else
			{
				throw new Exception("Unknown SQL Exception ");
			}
		}
		catch (Exception e2) {
			System.out.println(e2.getMessage()+"\n contact to customer care");
			System.out.println("\n\n care@ncshr.com");
		}
		
	}
}
