package p5;

public class EmployeeCountException extends Exception
{
	Project p;
	
	public EmployeeCountException(Project p) {
		super();
		this.p = p;
		
	}
	
	public String getMsg()
	{
		return p.getProjectName()+" Issue : Employee is 0 or less";
	}
}
