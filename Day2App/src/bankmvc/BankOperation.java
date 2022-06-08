package bankmvc;

public class BankOperation {

	Account arr[] = new Account[1000];
	int count = 0;

	public Account createAccount(Account a) {

		if (a.getAccountNumber() != 0) {
			// save account Database
			arr[count++] = a;
			return a;
		} else {
			return null;
		}

	}

	public String doDeposit(int searchAccountNumber, int amount) {
		String responseMsg = "error!!";

		for (int i = 0; i < count; i++) {
			if (arr[i].getAccountNumber() == searchAccountNumber) {
				arr[i].setBalance(arr[i].getBalance() + amount);
				responseMsg = amount + " added , New Balance is " + arr[i].getBalance();
				break;
			}
		}

		return responseMsg;
	}

	public Account[] getAllAccount() {
		return arr;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getAccountBalance(int searchAccountNumber) {
		for (int i = 0; i < count; i++) {
			if (arr[i].getAccountNumber() == searchAccountNumber) {
				return arr[i].getBalance();
			}
		}
		return 0;
	}

	public boolean doTransferFunds(int amount, int searchAccountNumber, int payeeAccountNumber) {
		boolean isTransferDone = false;

		for (int i = 0; i < count; i++) {
			Account account = arr[i];
			if (account.getAccountNumber() == searchAccountNumber) {
				int transferedAmount = account.fundTransfer(amount);
				if (transferedAmount != 0) {
					isTransferDone = true;
					break;
				}
			}
		}

		boolean isCredited = false;
		if (isTransferDone == true) {
			for (int i = 0; i < count; i++) {
				Account account = arr[i];

				if (account.getAccountNumber() == payeeAccountNumber) {
					account.setBalance(account.getBalance() + amount);
					isCredited = true;
					break;
				}
			}
		}

		return isTransferDone && isCredited;
	}

	public void callSpecificMethod() {
		for (Account account : arr) {

			if (account instanceof CurrentAccount) {
				CurrentAccount acc = (CurrentAccount) account;
				acc.giveBusinessLoan();
			}
			if (account instanceof SavingAccount) {
				SavingAccount acc = (SavingAccount) account;
				acc.provideCashBack();
			}

		}
	}

}
