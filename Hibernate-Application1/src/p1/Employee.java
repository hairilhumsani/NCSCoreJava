package p1;

import java.io.Serializable;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NCSEmployee")
public class Employee implements Comparable<Employee>,Serializable{
	
	
	
	@Column(name="ecode")
	@Id // used to mark the primary key
	private int empId;
	
	@Column(name="fullname")
	private String name;
	
	@Column(name="alligned_project")
	private int projectInfo;
	
	@Column(name="registeredemail",length = 50)
	private String email;
	
	@Column(nullable = false)
	private int bankAccount;
	

	private String designation;
	
	private int salary;
	
	@Embedded
	private Address permanentAddress;
	

	@Embedded
	@AttributeOverrides({
		 @AttributeOverride(name="houseNumber", column=@Column(name="temp_housenumber")),
		 @AttributeOverride(name="cityName", column=@Column(name="temp_cityName")),
		 @AttributeOverride(name="state", column=@Column(name="temp_state")),
		 @AttributeOverride(name="country", column=@Column(name="temp_country")),
		 @AttributeOverride(name="pincode", column=@Column(name="temp_pincode")),
	})
	private Address temporaryAddress;
	
	
	@ElementCollection
	private List<Authority> allAuthorities;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String name, int projectInfo, String email, int bankAccount, 
			String designation, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.projectInfo = projectInfo;
		this.email = email;
		this.bankAccount = bankAccount;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	public List<Authority> getAllAuthorities() {
		return allAuthorities;
	}

	public void setAllAuthorities(List<Authority> allAuthorities) {
		this.allAuthorities = allAuthorities;
	}

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
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
	public int getProjectInfo() {
		return projectInfo;
	}
	public void setProjectInfo(int projectInfo) {
		this.projectInfo = projectInfo;
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
		return "Employee [empId=" + empId + ", name=" + name + ", projectInfo=" + projectInfo + ", email=" + email
				+ ", bankAccount=" + bankAccount + ", designation=" + designation + ", salary="
				+ salary + "]";
	}
	
	@Override
	public int compareTo(Employee e2) {
		
		return this.getEmpId() - e2.getEmpId();
	}
	
	
	

}
