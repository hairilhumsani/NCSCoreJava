package p1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DatabaseClass {

	public static List<Transaction> allTransactions = new ArrayList<Transaction>();
	
	
	static
	{
		int tId = new Random().nextInt(50000);
		LocalDate date = LocalDate.of(2022, 2, 28);
		Transaction t1 = new Transaction(tId, date, 5800, "widrwal", 0);
		
		allTransactions.add(t1);
		
		int tId2 = new Random().nextInt(50000);
		LocalDate date2 = LocalDate.of(2022, 3, 28);
		Transaction t2 = new Transaction(tId2, date2, 15800, "Online Transfer", 125);
		
		allTransactions.add(t2);
		
		int tId3 = new Random().nextInt(50000);
		LocalDate date3 = LocalDate.of(2022, 6, 28);
		Transaction t3 = new Transaction(tId3, date3, 2800, "Online Payment", 8725);
		
		allTransactions.add(t3);
	}
	
	public static boolean addTransaction(Transaction t)
	{
		allTransactions.add(t);
		return true;
	}
	
	public static boolean validateUser(String username,String password)
	{
		boolean isValid = false;
		if(password.equals("123")) isValid = true;
		
			return isValid;
	}
	
	public static List<Transaction> getTransactionsByUser(String username)
	{
		return allTransactions;
	}
}
