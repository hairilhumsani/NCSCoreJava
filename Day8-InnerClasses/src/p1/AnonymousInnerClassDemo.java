package p1;

interface Employee 
{
   public void doWork();	
}

class Accountant implements Employee
{
	@Override
	public void doWork() {
		System.out.println("Account works on taxation file..");
	}
}

public class AnonymousInnerClassDemo {

	public static void main(String[] args) {
		AnonymousInnerClassDemo app = new AnonymousInnerClassDemo();
		
		
		// # approach 1 
		Employee e = new Accountant();
		app.doOfficeTask(e);
		
		// # approach 2 , missing concreate employee details
		
		app.doOfficeTask(new Employee() {
			
			@Override
			public void doWork() {
				System.out.println("Anonymus Employee works from Home");				
			}
		});
    }
	
	public void doOfficeTask(Employee e)
	{
		e.doWork();
	}
	
}
