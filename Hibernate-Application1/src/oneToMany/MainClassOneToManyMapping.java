package oneToMany;

import org.hibernate.Transaction;


import p1.Address;
import p1.Authority;
import p1.Employee;
import p1.HibernateUtil;
import p1.IdentityDocument;
import p1.Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

public class MainClassOneToManyMapping {

	public static void main(String[] args) {
		
		
		
		Session hibernate = HibernateUtil.getHibernateLink();
		Transaction t1 = hibernate.beginTransaction();
	
		System.out.println(" 3. Transaction started :- "+t1);
		
		Project p1 = new Project("TheCityBank-App", "App fo mobile useres", 100000);
		Project p2 = new Project("OnlineHealthTool", "App fo mobile useres for Clinical consultation", 120000);
		
		IdentityDocument dl1 = new IdentityDocument("Driving Licance","IND-DL-123");
		IdentityDocument passport1 = new IdentityDocument("Passport","IND-Pass-123");
		IdentityDocument dl2 = new IdentityDocument("Driving Licance","IND-DL-473");
		IdentityDocument pan1 = new IdentityDocument("PAN Number","IND-PAN-123");
		IdentityDocument passport2 = new IdentityDocument("Passport","IND-Pass-74123");
		
		
		Set<IdentityDocument> forE1_ids = new HashSet<>();
		Set<IdentityDocument> forE2_ids = new HashSet<>();
		
		
		forE1_ids.add(dl1);
		forE1_ids.add(passport1);
		forE1_ids.add(pan1);
		
		forE2_ids.add(passport2);
		forE2_ids.add(dl2);
		
		
		
		
		
		
			
		Address perAddress = new Address("ABC-123","Banglore","Karnataka","India",8780058);
		Address temAddress = new Address("Singa-7478","Singapore","Singapore","Singapre",985487);
		
		Authority readAuthority1 = new Authority("read", "31-12-2025");
		Authority updateAuthority1 = new Authority("update", "31-12-2022");
		
		List<Authority> allAuthority_Ramesh = new ArrayList<>();
		allAuthority_Ramesh.add(readAuthority1);
		allAuthority_Ramesh.add(updateAuthority1);
		
		
		
		
		Employee e = new Employee(103,"Amit Kumar", 4500);
		e.setPermanentAddress(perAddress);
		e.setTemporaryAddress(temAddress);
		e.setAllAuthorities(allAuthority_Ramesh);
		
		
		// ----- 2nd employee ----
		
		Address perAddress2 = new Address("ABC-Mumbai-123","Mumbai","Maharashtra","India",220058);
		Address temAddress2 = new Address("Singa-78","Hong-kong","HK123","China",7894487);
		
		Authority readAuthority2 = new Authority("read", "31-12-2025");
		Authority createAuthority2 = new Authority("create", "31-08-2022");
		Authority deleteAuthority2 = new Authority("delete", "31-08-2022");
		
		
		List<Authority> allAuthority_Neha = new ArrayList<>();
		allAuthority_Neha.add(readAuthority2);
		allAuthority_Neha.add(createAuthority2);
		allAuthority_Neha.add(deleteAuthority2);
		
		
		
		Employee e2 = new Employee(104,"Vinod", 74000);
		e2.setPermanentAddress(perAddress2);
		e2.setTemporaryAddress(temAddress2);
		e2.setAllAuthorities(allAuthority_Neha);
		
		
		
		// -------- Saving data through Hibernate -----
		// --- remember hbm2ddl set as create , which means deletion of previous entries 
		
		hibernate.save(e);
		hibernate.save(e2);
		
		hibernate.save(p1);
		hibernate.save(p2);
		
		
		
		e.setProjectInfo(p1);
		e2.setProjectInfo(p2);
		
		
		e.setDocument(forE1_ids);
		e2.setDocument(forE2_ids);
		
		
		System.out.println(" 4. Data Saved ");
		
		
		t1.commit();
		hibernate.close();
		
		System.out.println(" 5. Database commit & hibernate closed ...");
		
	}
}
