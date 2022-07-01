package com.ncs.businesslogic;

import java.util.Random;

public class NetBanking implements Payment{

	@Override
	public boolean makePayment(int amount, int payeeBankAccount, int receiverBankAccount) {
	
		boolean status = false;
		
		int otp = new Random().nextInt(5000);
		
		System.err.println("NOTIFICATION :- OTP recieved :- "+otp);
		
		System.out.println(" Payment Done through Netbanking Mode ");
		status = true;
		return status;
	}
	
	

}//end class
