package p1.ui;

import java.sql.SQLException;
import java.util.Scanner;

import p1.dto.EmployeeDTO;
import p1.execptions.InvalidProjectIdException;
import p1.model.Employee;
import p1.model.Project;
import p1.service.EmployeeService;
import p1.service.EmployeeServiceImpl;
import p1.service.ProjectService;
import p1.service.ProjectServiceImpl;

public class MainRunner {

	Scanner sc = new Scanner(System.in);
	
	EmployeeService empService;
	ProjectService projectService;
	
	public MainRunner() {
		empService = new EmployeeServiceImpl();
		projectService = new ProjectServiceImpl();
	}
	
	public static void main(String[] args) {
		
		MainRunner app = new MainRunner();
		
		while(true)
		{
			System.out.println("\n\n ============== Link Panel =====================");
			System.out.println("\n=======================================================");
			System.out.println("1. Insert Employee ");
			System.out.println("2. Add Project");
			System.out.println("3. Add Project to Employee");
			System.out.println("4. View All Employee");
			System.out.println("5. View Employee By ID ");
			System.out.println("6. Delete Project");
			System.out.println("7. Add Project");
			System.out.println("8. Projects, Employee Details"); // project Id , project Name , Employee Id, employee email
			                                                     // Project Id , total Salary , 
										// deleteEmployee
										// insert employees in batch 	
								// convert all DML queries in transactions
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
					break;
					
				case 5:
					app.viewEmployeeetails();
					break;
				case 6: 
					try {
						app.doDeleteProject();
						break;
					} catch (Exception e) {
						System.err.println("ERROR : - "+e);
					}
				case 7: 
					app.addProject();break;
			}
			
		}//end of while
	}//end of main
	
	
	private void addProject() {
		try {
			
			Project p = new Project();
			p.setProjectNumber(450);
			p.setProjectName("test project");
			p.setProjectHeadEmail("test@gmail.com");
			
			boolean status = projectService.addProkect(p);
			System.out.println(status);
		} 
		catch (SQLException e) {
			System.out.println("Click the below and download the software update..");
		}
		catch(InvalidProjectIdException e)
		{
			System.err.println("ERROR :- "+e);
		}
		
		
		
	}

	private void doDeleteProject()throws InvalidProjectIdException {
		
			System.out.println("Enter Project Number to be Deleted :- ");
			int projectNumber = Integer.parseInt(sc.nextLine());
			
			if(projectNumber >50)
			{
				throw new InvalidProjectIdException(projectNumber+"");
				
			}
			
			boolean status = projectService.deleteProject(projectNumber);
			System.out.println(status);

	}

	public void viewEmployeeetails()
	{
		System.out.println("Enter Employee ID to be Searched :- ");
		int searchId = Integer.parseInt(sc.nextLine());
		
		try {
			Employee e = empService.getEmployeeByID(searchId);
			if(e != null)
			{
				
				Project p = projectService.getProjectById(e.getProjectInfo());
				if(p != null)
				{
					EmployeeDTO dtoObject = new EmployeeDTO();
					dtoObject.setEmpId(e.getEmpId());
					dtoObject.setEmpName(e.getName());
					dtoObject.setEmailId(e.getEmail());
					dtoObject.setProjectName(p.getProjectName());
					dtoObject.setProjectHeadEmail(p.getProjectHeadEmail());
					
					//System.out.println(dtoObject);
					printEmployeeInfo(dtoObject);
				}
				else
				{
					EmployeeDTO dtoObject = new EmployeeDTO();
					dtoObject.setEmpId(e.getEmpId());
					dtoObject.setEmpName(e.getName());
					dtoObject.setEmailId(e.getEmail());
					dtoObject.setProjectName("No Project Allocated");
					dtoObject.setProjectHeadEmail("No Project Allocated");
					
					//System.out.println(dtoObject);
					printEmployeeInfo(dtoObject);
				}
			}
			else
			{
				System.out.println(" Wrong Employee ID !!!");
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception "+e.getMessage());
		}
	}
	
	public void printEmployeeInfo(EmployeeDTO dto)
	{
		System.out.println("______________________________________");
		System.out.println("Employee Id :- "+dto.getEmpId());
		System.out.println("Employee Name :- "+dto.getEmpName());
		System.out.println("Employee Email :- "+dto.getEmailId());
		System.out.println("Project Name :- "+dto.getProjectName());
		System.out.println("Project Head :- "+dto.getProjectHeadEmail());
		System.out.println("************************************************");
	}
	
	
	public void saveEmployee()
	{
		// code to insert values for Employee
		
		Employee e = new Employee(209, "Dani", 2000);
		try {
			boolean status = empService.saveEmployee(e);
			if(status == true)
			{
				System.out.println(e.getEmpId()+" Saved in the Database "+e);
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
	
	
}//end of class
