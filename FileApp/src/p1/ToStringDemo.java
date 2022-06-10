package p1;

import p5.Employee;

public class ToStringDemo {

	static 
	{
		System.out.println("before main");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmpId(101);
		e.setName("Mike");
		e.setSalary(2000);
		
		System.out.println(e);
		
		int x = 10;
		System.out.println(x);
		String str = "Singapore";
		System.out.println(str);
	}
}
