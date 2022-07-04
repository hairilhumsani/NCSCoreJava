package hql;

import org.hibernate.Session;


public class ReadRecords {
	
	public static void main(String[] args) {
		Session hibernate = HibernateUtil.getHibernateLink();
		
		
		
		System.out.println(" \n\n ------------- Load call --------------------------");
		Employee e = (Employee)hibernate.load(Employee.class, 103);
		
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		
		int salary = e.getSalary();
		System.out.println("Salary "+salary);
		
		System.out.println(" \n\n ------------- Get call --------------------------");
		Employee e2 = (Employee)hibernate.get(Employee.class, 104);
		
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		
		String name = e2.getName();
		System.out.println("Salary "+name);
		hibernate.close();
		
		System.out.println(" 5. Database commit & hibernate closed ...");
	}

}
