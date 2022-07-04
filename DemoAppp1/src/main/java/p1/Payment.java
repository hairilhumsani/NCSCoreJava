package p1;

import org.springframework.stereotype.Component;

@Component
interface Payment {
	public int doPayment(int amount);
}


@Component
class NetBanking implements Payment
{

	@Override
	public int doPayment(int amount) {
		// TODO Auto-generated method stub
		int result = amount - 5;
		return result;
	}
	
}


@Component
class CashPayment implements Payment
{

	@Override
	public int doPayment(int amount) {
		int result = amount + 10;
		return result;
	}
	
}


@Component
class DebitCard implements Payment
{

	@Override
	public int doPayment(int amount) {
		int result = amount - 10;
		return result;
	}
	
}

@Component
class CreditCard implements Payment
{

	@Override
	public int doPayment(int amount) {
		int result = amount - 15;
		return result;
	}
	
}

