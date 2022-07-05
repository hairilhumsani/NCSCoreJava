package p1;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee implements Comparable<Employee>,Serializable{

	@Value("101")
	private int empId;
	@Value("Mike")
	private String name;
	@Value("mike@gmail.com")
	private String email;
	@Value("12254789")
	private int bankAccount;
	@Value("developer")
	private String designation;
	@Value("200")
	private int salary;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String email, int bankAccount, String designation) {
		super();
		this.email = email;
		this.bankAccount = bankAccount;
		this.designation = designation;
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId - o.empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(int bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", bankAccount=" + bankAccount
				+ ", designation=" + designation + ", salary=" + salary + "]";
	}


}
