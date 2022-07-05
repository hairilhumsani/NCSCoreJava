package p1;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

// by default :- employee
@Component
public class Employee implements Comparable<Employee>,Serializable{
	

	
	private int empId;
	
	private String name;
	private String email;
	private int bankAccount;
	private String designation;
	// @Value("#{5800*1.90}")
	private int salary;
	
	//@Value(" #{employee.designation  == 'manager' }")
	@Value("#{employee.empId<1000?false:true}")
	private boolean isManager;

	//@Autowired(required = true)
	private Address address;
	
	@Autowired
	@Qualifier("medicalInsurance")
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
		System.out.println(" get address is called :- "+address);
		return address;
	}



	public void setAddress(Address address) {
		System.out.println(" set address is called "+address);
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
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", designation=" + designation
				+ ", salary=" + salary + ", address=" + address + ", getEmployeeInsurance()=" + getEmployeeInsurance()
				+ ", getAddress()=" + getAddress() + ", getEmpId()=" + getEmpId() + ", getName()=" + getName()
				+ ", getEmail()=" + getEmail() + ", getBankAccount()=" + getBankAccount() + ", getDesignation()="
				+ getDesignation() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}


	@Bean
	public Employee getEmployee()
	{
		return null;
	}
	
	
	

}
