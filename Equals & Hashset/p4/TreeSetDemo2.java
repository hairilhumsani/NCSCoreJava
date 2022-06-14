package p4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {

		Account a1 = new Account(101, "mike", 52000);// 108
		Account a2 = new Account(102, "abc", 300);// 108
		Account a3 = new Account(103, "jenny", 8000);// 111
		Account a5 = new Account(105, "jenny", 12000);// 111
		Account a6 = new Account(104, "Aaru", 72000);// 111

		TreeSet<Account> set = new TreeSet<>();
		set.add(a1);
		set.add(a2);
		set.add(a3);
		set.add(a5);
		set.add(a6);

		System.out.println("----- Sort based on Balance (default)-----");
		print(set, "Sort based on Balance");

		// as we have data in form of TreeSet , not in a list

		// step 1 :- insert the whole list into a set
		List<Account> list1 = new ArrayList<>();
		list1.addAll(set);
		// step 2:- create object of specific sorting class
		SortAccountByAccountNumber sortNumber = new SortAccountByAccountNumber();
		// step 3:- call sort operation
		Collections.sort(list1, sortNumber);
		print(list1, "Sort based on Number");

		List<Account> list2 = new ArrayList<>();
		list2.addAll(set);
		SortAccountBasedOnName sortName = new SortAccountBasedOnName();
		Collections.sort(list2, sortName);
		print(list2, "Sort based on Name");

	}

	public static void print(Collection<Account> collection, String tagLine) {
		System.out.println("\n-----" + tagLine + " -----\n");
		for (Account account : collection) {
			System.out.println(account);
		}
	}

}
