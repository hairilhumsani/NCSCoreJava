package p1;

import org.hibernate.Transaction;
import org.hibernate.Session;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Session hibernate = HibernateUtil.getHibernateLink();
		Transaction t1 = hibernate.beginTransaction();
	
		System.out.println(" 3. Transaction started :- "+t1);
		
		Employee e = new Employee(500, "ORMTest1",2000);
		Product p1 = new Product(1,"iphone",5,4f,"Apple");
		Product p2 = new Product(2,"iphone",5,4f,"Apple");
		//hibernate.save(e);
		hibernate.save(p1);
		hibernate.save(p2);
		
		
		
		System.out.println(" 4. Data Saved ");
		
		
		t1.commit();
		hibernate.close();
		
		System.out.println(" 5. Database commit & hibernate closed ...");
		
	}
}
