package p4;

import java.util.Comparator;


public class SortAccountBasedOnName implements Comparator<Account>{

	@Override
	public int compare(Account a1, Account a2) {
		return a1.getName().compareTo(a2.getName());
	}
	
	

}
