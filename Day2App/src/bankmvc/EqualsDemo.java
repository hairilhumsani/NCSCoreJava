package bankmvc;

public class EqualsDemo {

	public static void main(String[] args) {
		
		Account a1 = new SavingAccount();
		a1.setAccountNumber(101);
		a1.setName("A");
		a1.setBalance(10000);
		a1.setAccountType("Saving Acount");
		
		Account a2 = new SavingAccount();
		a2.setAccountNumber(101);
		a2.setName("A");
		a2.setBalance(10000);
		a2.setAccountType("Saving Acount");
		
		int x = 10;
		int y = 10;
		
		boolean b1 = (x == y);
		System.out.println(b1);
		
		boolean b2  = (a1 == a2);
		System.out.println(b2);
		
		System.out.println(a1.equals(a2));

	}

}
