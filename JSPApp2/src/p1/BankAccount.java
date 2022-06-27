package p1;

public class BankAccount {

	private String accountName;
	private int balance;
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountName=" + accountName + ", balance=" + balance + "]";
	}
	
	
}
