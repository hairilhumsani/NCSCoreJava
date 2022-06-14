package p4;

import java.util.TreeSet;

public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		
		TreeSet<Integer> set1 = new TreeSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(-4);
		
		System.out.println(set1);
		//---------------------------------------------------------
		
		TreeSet<String> set2  = new TreeSet<>();
		set2.add("abc");
		set2.add("abc");
		set2.add("aabc");
		set2.add("abc");
		set2.add("abbc");
		set2.add("atbc");
		set2.add("babc");
		set2.add("aabbc");
		System.out.println(set2);
		
		
		
		
	}

}
