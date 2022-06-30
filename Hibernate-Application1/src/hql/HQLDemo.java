package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import p1.Employee;
import p1.HibernateUtil;

public class HQLDemo {
	public static void main(String[] args) {
		Session hibernate = HibernateUtil.getHibernateLink();
		
		
		//getAll(hibernate);
		whereClause(hibernate);
		
		
	}
	
	public static void whereClause(Session hibernate)
	{
		String query = "from Employee where salary > :xyz"; // select * from NCSEmployee
		Query q = hibernate.createQuery(query);
		q.setInteger("xyz", 5000);
		List<Employee> list =  q.list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
	
	public static void getAll(Session hibernate)
	{
		String query = "from Employee"; // select * from NCSEmployee
		Query q = hibernate.createQuery(query);
		List<Employee> list =  q.list();
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}

}
