package p1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

class Device{}
class MobilePhone extends Device{}
class SmartPhone extends MobilePhone{}
class SmartWatch extends Device{}

public class BasicApp3 {
	public static void main(String[] args) {
		//  <MobilePhone>	
		//List<MobilePhone> list = new LinkedList<>(); // always declare like this way
		List list = new LinkedList<>(); // avoid to declare like this
		
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
		
		list.add(new Device());
		list.add(new MobilePhone());
		list.add(new SmartPhone());
		
		list.add(new SmartWatch());
		
		
		list.add(new NullPointerException("Just a test of Collection"));
		list.add(new Laptop());
		list.add(new Dog());
		list.add(new Integer(88));
		list.add(new Object());
		
		approach2(list);
	}
	
	
	
	public static void approach2(List list)
	{
		
		for (Object object : list) {
			System.out.print(object);
			System.out.print("-  "+object.equals("Hello"));
			
		}
	}
	
	
	
	

}






















