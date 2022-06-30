package ui;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


import model.Accounts;
import model.IdentityDocument;
import model.Insurance;
import model.Stock;
import model.TradingAccount;
import model.Transactions;

public class MainClass {

	public static void main(String[] args) {

		Session hibernate = HibernateUtil.getHibernateLink();
		Transaction t1 = hibernate.beginTransaction();
		
		Accounts accounts = new Accounts(1, "hairil", 37);

		Insurance healthInsurance1 = new Insurance(1, "health");
		Insurance carInsurance1 = new Insurance(1, "car");
		Insurance medicalInsuracnce1 = new Insurance(1, "medical");

		Transactions transaction1 = new Transactions("Physical", 20, "2022-02-11", "Failed");
		Transactions transaction2 = new Transactions("Physical", 40, "2022-02-13", "Success");
		
		

		List<Transactions> allTransactions = new ArrayList<>();
		allTransactions.add(transaction1);
		allTransactions.add(transaction2);
		
		TradingAccount tradingAccount1 = new TradingAccount("Crypto",200);
		Stock stock1 = new Stock(50,60,"Singtel");
		Stock stock2 = new Stock(40,60,"NCS");
		IdentityDocument document1 = new IdentityDocument("DL",123,accounts.getAccountId());
		IdentityDocument document2 = new IdentityDocument("Passport",300,accounts.getAccountId());
		
		Set<IdentityDocument> id1 = new HashSet<>();
		id1.add(document1);
		id1.add(document2);
		
		Set<Stock> stockSet1 = new HashSet<>();
		stockSet1.add(stock1);
		stockSet1.add(stock2);
		
		
		accounts.setAllTransaction(allTransactions);
		accounts.setCarInsurance(carInsurance1);
		accounts.setHealthInsurance(healthInsurance1);
		accounts.setMedicalInsurance(medicalInsuracnce1);
		accounts.setDocument(id1);
		accounts.setTradingAccount(tradingAccount1);
		
		
		
		
		hibernate.save(accounts);
		hibernate.save(tradingAccount1);
		
		tradingAccount1.setAllStock(stockSet1);
		
		
		
		
	/*	Update	
	 * hibernate.evict(accounts);
		medicalInsuracnce1 = new Insurance(1, "medical Plus");
		accounts.setMedicalInsurance(medicalInsuracnce1);
		hibernate.update(accounts);*/
		

		System.out.println(" 4. Data Saved ");

		t1.commit();
		hibernate.close();

		System.out.println(" 5. Database commit & hibernate closed ...");

	}

}
