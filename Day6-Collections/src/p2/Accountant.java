package p2;

public class Accountant extends Employee
{

	public Accountant() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Accountant(String name, int salary, int id) {
		super(name, salary, id);
	}


	
	
	@Override
	public int getSalary() {
		
		return super.salary;
	}


	public void doSalaryThings()
	{
		
		// accountant credited the salary
		System.out.println("Accountant Credited the Salary");
	}
	
}