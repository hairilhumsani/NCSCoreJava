package p1;

import java.io.Serializable;
import java.util.List;
import java.util.Set;


public class Employee implements Comparable<Employee>,Serializable{
	

	private int empId;
	private String name;
	private String email;
	private int bankAccount;
	private String designation;
	private int salary;
	private Address address;

	private List<Dependent> empDependents;
	//-----------------------------------------------------------------------
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

	
	

	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
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
