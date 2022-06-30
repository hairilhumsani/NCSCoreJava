package hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import model.Accounts;
import ui.HibernateUtil;


public class HQL {
	public static void main(String[] args) {
		Session hibernate = HibernateUtil.getHibernateLink();
		
		
		//getAll(hibernate);
		whereClause(hibernate);
		
		
	}
	
	
	public static void whereClause(Session hibernate)
	{
		String query = "from Accounts where age > :xyz"; // select * from NCSEmployee
		Query q = hibernate.createQuery(query);
		q.setInteger("xyz", 30);
		List<Accounts> list =  q.list();
		
		for (Accounts account : list) {
			System.out.println(account);
		}
	}
	
	public static void getAll(Session hibernate)
	{
		String query = "from Accounts select *"; // select * from NCSEmployee
		Query q = hibernate.createQuery(query);
		List<Accounts> list =  q.list();
		
		for (Accounts acc : list) {
			System.out.println(acc);
		}
	}
}
