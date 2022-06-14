package p4;

import java.util.*;


public class SetDemo 
{
	
	public static void main(String[] args) {
		
		Set<Account> set = new LinkedHashSet<>();
		
		Account a1 = new Account(101, "mike", 2000);//108
		Account a2 = new Account(102, "abc", 3000);//108
		Account a3 = new Account(103, "jenny", 2000);//111
		Account a5 = new Account(103, "jenny", 2000);//111
		Account a6 = new Account(104, "paru", 2000);//111
		
		Account a4 = a1;
		
		
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a4);
		set.add(a5);
		set.add(a6);
		
		
		
		
		
		
		
		System.out.println(set.size());
		
		
	
		
	}//end main

}//end class








