package p1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static Session hibernate= null;
	static
	{
		Configuration cfg = new Configuration();
		SessionFactory factoryToProvideORM = cfg.configure().buildSessionFactory();
		
		System.out.println("1 factory created :- "+factoryToProvideORM);
		
		hibernate = factoryToProvideORM.openSession();
		System.out.println("2 verify Hbernate "+hibernate);
	
	}
	
	public static Session getHibernateLink()
	{
		return hibernate;
	}

}
