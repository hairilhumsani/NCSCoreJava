package ui;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


import model.Accounts;
import model.Insurance;
import model.Transactions;

public class MainClass {

	public static void main(String[] args) {

		Session hibernate = HibernateUtil.getHibernateLink();
		Transaction t1 = hibernate.beginTransaction();

		Insurance healthInsurance1 = new Insurance(1, "health");
		Insurance carInsurance1 = new Insurance(1, "car");
		Insurance medicalInsuracnce1 = new Insurance(1, "medical");

		Transactions transaction1 = new Transactions("Physical", 20, "2022-02-11", "Failed");
		Transactions transaction2 = new Transactions("Physical", 40, "2022-02-13", "Success");

		List<Transactions> allTransactions = new ArrayList<>();
		allTransactions.add(transaction1);
		allTransactions.add(transaction2);

		Accounts accounts = new Accounts(1, "hairil", 37);
		accounts.setAllTransaction(allTransactions);
		accounts.setCarInsurance(carInsurance1);
		accounts.setHealthInsurance(healthInsurance1);
		accounts.setMedicalInsurance(medicalInsuracnce1);

		hibernate.save(accounts);
		
		hibernate.evict(transaction1);
		transaction1 = new Transactions("Physical", 20, "2022-02-11", "Failed");
		hibernate.update(accounts);
		

		System.out.println(" 4. Data Saved ");

		t1.commit();
		hibernate.close();

		System.out.println(" 5. Database commit & hibernate closed ...");

	}

}
