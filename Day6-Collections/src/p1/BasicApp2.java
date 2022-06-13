package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Laptop{}
class Dog{}

public class BasicApp2 {
	public static void main(String[] args) {
			
		List list = new LinkedList();
		list.add("Hello");
		list.add("Hello");
		list.add("Hello");
		list.add("Hello");
		
		list.add(1);
		list.add(15.85);
		list.add(false);
		list.add(false);
		list.add(false);
		list.add(false);
		
		list.add(new NullPointerException("Just a test of Collection"));
		list.add(new Laptop());
		list.add(new Dog());
		list.add(new Integer(88));
		list.add(new Object());
		
		approach3(list);
	}
	
	public static void approach1(List list)
	{
		System.out.println(list);
	}
	
	public static void approach2(List list)
	{
		/* based on enhance for loop*/
		
		System.out.println("\n\n\n ========== Enhanced for loop ================");
		
		for (Object object : list) {
			System.out.print(object);
			System.out.print("-  "+object.equals("Hello"));
			/*
			String myData = (String)object;
			System.out.print(" - "+myData.toUpperCase()+"\n");
			*/
		}
	}
	
	public static void approach3(List list)
	{
		/* Use of Iterator type*/
		
		Iterator itr =list.iterator();
		
		while(itr.hasNext())
		{
			Object obj = itr.next();
			System.out.println(obj);
		}
		
	}
	
	

}






















