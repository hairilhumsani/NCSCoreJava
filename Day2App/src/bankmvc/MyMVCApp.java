package bankmvc;

import java.util.Scanner;

// view layer 
public class MyMVCApp {

	Scanner sc = new Scanner(System.in);
	Scanner stringScanner = new Scanner(System.in);
	
	BankOperation bankOps = new BankOperation();
	
	public static void main(String[] args) {
		MyMVCApp app = new MyMVCApp();
		
	
		while(true)
		{
			System.out.println("\n\n -------------------------------------\n");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. View Balance");
			System.out.println("4. View All Accounts ");
			System.out.println("5. Add ID of Client");
			System.out.println("6. Add Phone number ");
			System.out.println("7. Widrwal Amount");
			System.out.println("8. Account Details");
			System.out.println("9. Account Based on Balance Range");
			System.out.println("10. Transfer Fund");
			System.out.println("11. Specifc Method Call");
			
			
			
			System.out.println("0. Exit");
			
			System.out.println("Enter User Choice :- ");
			int choice = app.sc.nextInt(); // static object can access through object only
			
			switch (choice) {
				case 1:
					
					app.userCreateAccountForm();
					break;
				case 2: 
					app.doDeposit();
					break;
				case 3:
					app.displayBalance();
					break;
				case 0:
					System.exit(0);
					break;
				case 4:
					app.displayAllAccounts();
					break;
				case 10:
					app.fundTransferUseCase();
					break;
				case 11:
					app.specficMethodCall();
					break;
			default:
				break;
			}
			
		}
		
	}
	public void specficMethodCall()
	{
		bankOps.callSpecificMethod();
	}
	
	
	public void fundTransferUseCase()
	{
		System.out.println("Enter the Source Account Number  ");
		int accNumber = sc.nextInt();
		
		System.out.println("Enter the Amount to be Transfered  ");
		int amount = sc.nextInt();
		
		System.out.println("Enter the Payee Account Number  ");
		int payeeAccNumber = sc.nextInt();
		
		boolean status = bankOps.doTransferFunds(amount, accNumber, payeeAccNumber);
			
		if(status)
		{
			System.out.println("Fund Transfered Successfuly ");
		}
		else
		{
			System.out.println(" Error Contact to Customer Care ");
		}
		
	}
	
	public void displayAllAccounts()
	{
		Account arr[] = bankOps.getAllAccount();
		int count = bankOps.getCount();
		
		for(int i = 0;i<count;i++)
		{
			System.out.println(arr[i].showAccountDetails());
		}
		
	}
	
	public void displayBalance()
	{
		System.out.println("Enter the Account Number Where to Deposit Amount ");
		int accNumber = sc.nextInt();
			
		int accountBalance = bankOps.getAccountBalance(accNumber);
		
		if(accountBalance != 0)
		{
			System.out.println(" Balance :- "+accountBalance);
		}
		else
		{
			System.out.println("Enter Valid Account Number ... ");
		}
	}
	
	public void doDeposit()
	{
		System.out.println("Enter the Account Number Where to Deposit Amount ");
		int accNumber = sc.nextInt();
				
		System.out.println("Enter the amount to add ");
		int amount = sc.nextInt();
		
		String response = bankOps.doDeposit(accNumber, amount);
		System.out.println(response);
	}
	
	  // ---------------- client layer ----------------------
	public void userCreateAccountForm()
	{
		
		System.out.println("Enter the Account Holder Name ");
		String name = stringScanner.nextLine();
		
		System.out.println("Enter the Account Number ");
		int accNumber = sc.nextInt();
				
		System.out.println("Enter the Account Initial Balance ");
		int balance = sc.nextInt();
		
		System.out.println("Choose Account Type");
		System.out.println(" 1> Current Account");
		System.out.println("2> Saving Account");
		
		int accType = sc.nextInt();
		Account a = null;
		if(accType == 1)
		{
			a = new CurrentAccount();// client layer
			a.setAccountType("Current Account");
		}
		else if(accType == 2)
		{
			a = new SavingAccount();
			a.setAccountType("Saving Account");
		}
		
		a.setAccountNumber(accNumber);
		a.setBalance(balance);
		a.setName(name);
		
		Account savedObject = bankOps.createAccount(a);
		if(savedObject == null)
		{
			System.out.println("Contact to Customer Care ...");
		}
		else
		{
			System.out.println("Account Created "+savedObject.showAccountDetails());
		}
		
		
		Account a1 = new SavingAccount();
		a1.setAccountNumber(101);
		a1.setName("A");
		a1.setBalance(10000);
		a1.setAccountType("Saving Acount");
		
		Account a2 = new CurrentAccount();
		a2.setAccountNumber(102);
		a2.setName("B");
		a2.setBalance(2800);
		a2.setAccountType("Current Acount");
		
		Account a3 = new SavingAccount();
		a3.setAccountNumber(103);
		a3.setName("C");
		a3.setBalance(3000);
		a3.setAccountType("Saving Acount");
		
		bankOps.createAccount(a1);
		bankOps.createAccount(a2);
		bankOps.createAccount(a3);
		
		
	}
}
