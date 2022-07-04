package p1;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// by default :- employee
@Component
public class Employee implements Comparable<Employee>,Serializable{
	

	@Value("789")
	private int empId;
	@Value("${employee.name}")
	private String name;
	private String email;
	private int bankAccount;
	private String designation;
	@Value("${employee.salary}")
	private int salary;

	@Autowired
	private Address address;
	
	@Autowired
	@Qualifier("carInsurance")
	private Insurance employeeInsurance;

	//-----------------------------------------------------------------------
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	public Insurance getEmployeeInsurance() {
		return employeeInsurance;
	}




	public void setEmployeeInsurance(Insurance employeeInsurance) {
		this.employeeInsurance = employeeInsurance;
	}




	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
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
