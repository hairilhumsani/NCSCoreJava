package com.ncs.businesslogic;

import java.util.Random;

public class DebitCard implements Payment{

	@Override
	public boolean makePayment(int amount, int payeeBankAccount, int receiverBankAccount) {
	
		boolean status = false;
		
		System.out.println(" Payment Done through Debit card , Confirmation slip generated ... ");
		status = true;
		return status;
	}
	
	

}//end class