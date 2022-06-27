package p1;

import java.time.LocalDate;

public class Transaction {
	
	private int transactionId;
	private LocalDate date;
	private int amount;
	private String type;
	private int secondAccount;
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transaction(int transactionId, LocalDate date, int amount, String type, int secondAccount) {
		super();
		this.transactionId = transactionId;
		this.date = date;
		this.amount = amount;
		this.type = type;
		this.secondAccount = secondAccount;
	}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getSecondAccount() {
		return secondAccount;
	}
	public void setSecondAccount(int secondAccount) {
		this.secondAccount = secondAccount;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", date=" + date + ", amount=" + amount + ", type="
				+ type + ", secondAccount=" + secondAccount + "]";
	}
	
	
	

}
