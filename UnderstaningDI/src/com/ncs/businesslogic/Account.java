package com.ncs.businesslogic;


public class Account {

	// lot ...
	
	public String fundTransfer(Payment paymentMode,int amount,int accNumberPayee,int recieverBankAccount)
	{
		String notificationMsg = "";
		
		boolean paymentStatus = paymentMode.makePayment(amount, accNumberPayee, recieverBankAccount);
		
		if(paymentStatus)
		{
			notificationMsg = "Payment Made Successful through "+paymentMode.getClass();
		}
		else
		{
			notificationMsg = "Payment Cancel .. Try Again or Contact to Bank ";
		}
		
		return notificationMsg;
	}
}
