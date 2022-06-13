package p2;

public class Developer extends Employee
{
	
	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(String name, int salary, int id) {
		super(name, salary, id);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int getSalary() {
		
		return super.salary;
	}

	public void submitProject()
	{
		System.out.println("Developer project submission");
	}
}