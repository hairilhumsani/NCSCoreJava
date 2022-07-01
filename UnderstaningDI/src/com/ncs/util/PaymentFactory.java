package com.ncs.util;

import com.ncs.businesslogic.DebitCard;
import com.ncs.businesslogic.NetBanking;
import com.ncs.businesslogic.Payment;

public class PaymentFactory {
	
	public static Payment getPayment(String paymentOption)
	{
		if(paymentOption.equals("netbanking"))
		{
			return new NetBanking();
		}
		else if(paymentOption.equals("debitCard"))
		{
			return new DebitCard();
		}
		else 
		{
			return null;
		}
	}

}
