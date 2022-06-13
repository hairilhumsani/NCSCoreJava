package p2;

import java.util.Random;

public class EmployeeFactory {

	public static Employee getEmployee(String name,int salary,String type)
	{
		Employee e = null;
		
		if(type.equals("Accountant"))
		{
			int id = new Random().nextInt(1000);
			e = new Accountant(name,salary,id);
			
		}
		else if(type.equals("Developer"))
		{
			int id = new Random().nextInt(1000);
			e = new Developer(name,salary,id);
			
		}
		
		
		return e;
	}
}
