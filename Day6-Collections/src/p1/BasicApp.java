package p1;

import java.util.*;

public class BasicApp {
	
	public static void main(String[] args) {
		
		
//		Collection myCollection  = new Collection(); // error becoz collection is the interface
	
//		List myList = new List(); // same reason like above , list is an interface
		
		Collection c1 = new ArrayList(); // Employee e = new Accountant();
		
		Collection c2 = new HashSet(); // Employee e = new Accountant();
		
		Collection c3 = new TreeSet(); // Employee e = new Accountant();
		
		
		
		List list1 = new ArrayList();
		
		List list2 = new LinkedList();
		
		Set set1 = new HashSet();
		
		
		doThings(c1);
		doThings(c2);
		doThings(c3);
		doThings(list1);
		doThings(list2);
		doThings(set1);
		
		
	}//end of main
	
	public static void doThings(Collection c)
	{
		
	}
	
	

}//end of class
