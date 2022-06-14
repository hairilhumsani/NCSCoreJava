package p4;

import java.util.Comparator;

public class SortAccountByAccountNumber implements Comparator<Account>{

	@Override
	public int compare(Account a1, Account a2) {
		return a1.getAccountNumber() - a2.getAccountNumber();
	}
	
	

}
