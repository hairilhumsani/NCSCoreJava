package p5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass  {
	static Project arr[] = new Project[2];

	static {
		
		// sample data for 1 project

		Project p1 = new Project();
		p1.setProjectName("Bank Application Project");

		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setName("A");
		e1.setSalary(2000);

		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setName("B");
		e2.setSalary(6000);

		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setName("C");
		e3.setSalary(2800);

		Employee e4 = new Employee();
		e4.setEmpId(4);
		e4.setName("D");
		e4.setSalary(3000);

		Employee resourceTeam1[] = new Employee[3];
		resourceTeam1[0] = e1;
		resourceTeam1[1] = e2;
		resourceTeam1[2] = e3;

		p1.setResourceTeam(resourceTeam1);	
		
		// sample data for 2nd project
		Project p2 = new Project();
		p2.setProjectName(" Car Application Project ");
		
		Employee resourceTeam2[] = new Employee[2];
		resourceTeam2[0] = e4;
		resourceTeam2[1] = e2;
		p2.setResourceTeam(resourceTeam2);
		
				
		// add project in the array
		arr[0] = p1;
		arr[1] = p2;
		
		
	}

	
	
	public static void main(String[] args) {

		MainClass app = new MainClass();
		
		for (Project project : arr) {
			app.createProjectFile(project);
		}

	}

	public void createProjectFile(Project project)
	{
		String rootPath = "C:\\Users\\Hp\\Desktop\\NCS Singapore\\";
		String fileName = "projectDoc.txt";
		File f = new File(rootPath+fileName);
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try
		{
			fw = new FileWriter(f,true);
		    pw = new PrintWriter(fw);
			
			pw.print("\n "+project);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		pw.flush();
		pw.close();
		
	}
	
	
	public void displayEmployeeInfo(Employee e) {
		System.out.println(e);
	}

	

	

}
