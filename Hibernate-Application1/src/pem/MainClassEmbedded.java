package pem;

import org.hibernate.Transaction;


import p1.Address;
import p1.Employee;
import p1.HibernateUtil;

import org.hibernate.Session;

public class MainClassEmbedded {

	public static void main(String[] args) {
		
		
		
		Session hibernate = HibernateUtil.getHibernateLink();
		Transaction t1 = hibernate.beginTransaction();
	
		System.out.println(" 3. Transaction started :- "+t1);
		
		Address perAddress = new Address("ABC-123","New Delhi","Delhi","India",110058);
		Employee e = new Employee(101,"Ramesh", 2000);
		e.setPermanentAddress(perAddress);
		
		hibernate.save(e);
		
		System.out.println(" 4. Data Saved ");
		
		
		t1.commit();
		hibernate.close();
		
		System.out.println(" 5. Database commit & hibernate closed ...");
		
	}
}
