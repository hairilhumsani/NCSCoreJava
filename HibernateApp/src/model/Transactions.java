package model;

import javax.persistence.Embeddable;

@Embeddable
public class Transactions {

	private String transactionType;
	private int amount;
	private String date;
	private String status;

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Transactions(String transactionType, int amount, String date, String status) {
		super();
		this.transactionType = transactionType;
		this.amount = amount;
		this.date = date;
		this.status = status;
	}

	public Transactions() {
		super();

	}

	@Override
	public String toString() {
		return "Transactions [transactionType=" + transactionType + ", amount=" + amount + ", date=" + date
				+ ", status=" + status + "]";
	}
	
	

}
