package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;

@Entity
@Table(name = "HealthDatabase")

public class Accounts {

	@Column
	@Id
	private int accountId;

	@Column
	private String name;

	@Column
	private int age;

	public Accounts(int accountId, String name, int age) {
		super();
		this.accountId = accountId;
		this.name = name;
		this.age = age;
	}

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "policyNumber", column = @Column(name = "medical_policyNumber")),
			@AttributeOverride(name = "insuranceName", column = @Column(name = "medical_insuranceName")), })
	private Insurance medicalInsurance;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "policyNumber", column = @Column(name = "car_policyNumber")),
			@AttributeOverride(name = "insuranceName", column = @Column(name = "car_insuranceName")), })
	private Insurance carInsurance;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "policyNumber", column = @Column(name = "health_policyNumber")),
			@AttributeOverride(name = "insuranceName", column = @Column(name = "health_insuranceName")), })
	private Insurance healthInsurance;

	@ElementCollection
	private List<Transactions> allTransaction;
	
	@OneToMany
	@JoinColumn(name="documents")
	private List<IdentityDocument> document;
	

	public List<IdentityDocument> getDocument() {
		return document;
	}

	public void setDocument(List<IdentityDocument> document) {
		this.document = document;
	}

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AllignedTrading")
	private TradingAccount tradingAccount;

	public TradingAccount getTradingAccount() {
		return tradingAccount;
	}

	public void setTradingAccount(TradingAccount tradingAccount) {
		this.tradingAccount = tradingAccount;
	}

	public Insurance getMedicalInsurance() {
		return medicalInsurance;
	}

	public void setMedicalInsurance(Insurance medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public Insurance getCarInsurance() {
		return carInsurance;
	}

	public void setCarInsurance(Insurance carInsurance) {
		this.carInsurance = carInsurance;
	}

	public Insurance getHealthInsurance() {
		return healthInsurance;
	}

	public void setHealthInsurance(Insurance healthInsurance) {
		this.healthInsurance = healthInsurance;
	}

	public List<Transactions> getAllTransaction() {
		return allTransaction;
	}

	public void setAllTransaction(List<Transactions> allTransaction) {
		this.allTransaction = allTransaction;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Accounts [accountId=" + accountId + ", name=" + name + ", age=" + age + ", medicalInsurance="
				+ medicalInsurance + ", carInsurance=" + carInsurance + ", healthInsurance=" + healthInsurance
				+ ", allTransaction=" + allTransaction + ", document=" + document + ", tradingAccount=" + tradingAccount
				+ "]";
	}

}
