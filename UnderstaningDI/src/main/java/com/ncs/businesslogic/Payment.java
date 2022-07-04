package com.ncs.businesslogic;

public interface Payment {

	public boolean makePayment(int amount,int payeeBankAccount,int receiverBankAccount);
}
