package model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;

@Entity
@Table(name = "HealthDatabase")
public class Accounts implements Comparable, Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	private int accountId;
	private String name;
	private int age;
	
	public Accounts()
	{
		
	}

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
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="accountId")
	private Set<IdentityDocument> document;
	

	public Set<IdentityDocument> getDocument() {
		return document;
	}

	public void setDocument(Set<IdentityDocument> document) {
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

	@Override
	public int hashCode() {
		return Objects.hash(accountId, age, allTransaction, carInsurance, document, healthInsurance, medicalInsurance,
				name, tradingAccount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Accounts other = (Accounts) obj;
		return accountId == other.accountId && age == other.age && Objects.equals(allTransaction, other.allTransaction)
				&& Objects.equals(carInsurance, other.carInsurance) && Objects.equals(document, other.document)
				&& Objects.equals(healthInsurance, other.healthInsurance)
				&& Objects.equals(medicalInsurance, other.medicalInsurance) && Objects.equals(name, other.name)
				&& Objects.equals(tradingAccount, other.tradingAccount);
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
	
}
