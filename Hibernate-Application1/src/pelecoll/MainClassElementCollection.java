package pelecoll;

import org.hibernate.Transaction;


import p1.Address;
import p1.Authority;
import p1.Employee;
import p1.HibernateUtil;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

public class MainClassElementCollection {

	public static void main(String[] args) {
		
		
		
		Session hibernate = HibernateUtil.getHibernateLink();
		Transaction t1 = hibernate.beginTransaction();
	
		System.out.println(" 3. Transaction started :- "+t1);
		
			
		Address perAddress = new Address("ABC-123","New Delhi","Delhi","India",110058);
		Address temAddress = new Address("Singa-478","Singapore","Singapore","Singapre",125487);
		
		Authority readAuthority1 = new Authority("read", "31-12-2025");
		List<Authority> allAuthority_Ramesh = new ArrayList<>();
		allAuthority_Ramesh.add(readAuthority1);
		
		
		
		Employee e = new Employee(101,"Ramesh", 2000);
		e.setPermanentAddress(perAddress);
		e.setTemporaryAddress(temAddress);
		e.setAllAuthorities(allAuthority_Ramesh);
		
		
		// ----- 2nd employee ----
		
		Address perAddress2 = new Address("XYZ-Mumbai-123","Mumbai","Maharashtra","India",220058);
		Address temAddress2 = new Address("Singa-1470","Hong-kong","HK123","China",784487);
		
		Authority readAuthority2 = new Authority("read", "31-12-2025");
		Authority createAuthority2 = new Authority("create", "31-08-2022");
		
		List<Authority> allAuthority_Neha = new ArrayList<>();
		allAuthority_Neha.add(readAuthority2);
		allAuthority_Neha.add(createAuthority2);
		
		
		Employee e2 = new Employee(102,"Neha", 2000);
		e2.setPermanentAddress(perAddress2);
		e2.setTemporaryAddress(temAddress2);
		e2.setAllAuthorities(allAuthority_Neha);
		
		
		
		
		
		hibernate.save(e);
		hibernate.save(e2);
		
		
		System.out.println(" 4. Data Saved ");
		
		
		t1.commit();
		hibernate.close();
		
		System.out.println(" 5. Database commit & hibernate closed ...");
		
	}
}
