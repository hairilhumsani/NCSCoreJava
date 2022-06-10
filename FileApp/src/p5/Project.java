package p5;

import java.io.Serializable;
import java.util.Arrays;

public class Project implements Serializable
{
	
	private String projectName;
	private Employee resourceTeam[]; // List<>
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Employee[] getResourceTeam() {
		return resourceTeam;
	}
	public void setResourceTeam(Employee[] resourceTeam) {
		this.resourceTeam = resourceTeam;
	}
	@Override
	public String toString() {
		String resourceids = "";
		for (Employee employee : resourceTeam) {
			resourceids+= employee.getEmpId()+", ";
		}
		
		return projectName+" : ResourceTeam-EmployeeId "+resourceids;
	}
	
	
	

}
