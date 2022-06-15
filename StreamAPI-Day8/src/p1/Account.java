package p1;

import java.io.Serializable;

public class Account implements Serializable , Comparable<Account>{

	private int accountNumber;
	private String name ; 
	private int balance;
	
	
	public Account(int num, String accName, int accBalance) {
		accountNumber = num;
		name = accName;
		balance = accBalance;
	}


	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accNum) {
		accountNumber = accNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String accHolderName) {
		name = accHolderName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int initialBalance) {
		balance = initialBalance;
		
	}
	
	public String showAccountDetails()
	{
		return "Account -"+accountNumber+" , "+name+" , $"+balance+"";
	}

	@Override
	public int hashCode() {
		
		//System.out.println(" --->> Inside Hashcode :- "+this.name+" - "+this.accountNumber);
		return (int)(name.length()+accountNumber+3);
		//108
	}

	@Override
	public boolean equals(Object obj) {
		//System.out.println(" ---------------->> Inside Equals :- "+this.name+" - "+this.accountNumber);
		if(obj instanceof Account)
		{
			Account account = (Account) obj;
			
			boolean a = this.name.equals(account.name);
			boolean b = this.accountNumber == account.accountNumber;
			boolean c = this.balance == account.balance;
			
			return a && b && c;
			
		}
		else return false;
	}


	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", name=" + name + ", balance=" + balance + "]";
	}



	@Override
	public int compareTo(Account a) {
		return this.balance - a.balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}//end of laptop class
