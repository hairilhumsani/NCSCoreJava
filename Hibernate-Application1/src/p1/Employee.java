package p1;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="NCSEmployee")
public class Employee implements Comparable<Employee>,Serializable{
	
	@Column(name="ecode")
	@Id // used to mark the primary key
	private int empId;
	
	@Column(name="fullname")
	private String name;
	

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
	@CollectionTable(name = "EmployeeAuthorities"  ) // used to configure table name
	private List<Authority> allAuthorities;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "AllignedProject")
	private Project projectInfo;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "EmployeeNumber")
	private Set<IdentityDocument> document;
	
	//-----------------------------------------------------------------------
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name, String email, int bankAccount, String designation, int salary,
			Address permanentAddress, Address temporaryAddress, List<Authority> allAuthorities, Project projectInfo) {
		super();
		this.empId = empId;
		this.name = name;
		this.email = email;
		this.bankAccount = bankAccount;
		this.designation = designation;
		this.salary = salary;
		this.permanentAddress = permanentAddress;
		this.temporaryAddress = temporaryAddress;
		this.allAuthorities = allAuthorities;
		this.projectInfo = projectInfo;
	}

	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	

	public Set<IdentityDocument> getDocument() {
		return document;
	}

	public void setDocument(Set<IdentityDocument> document) {
		this.document = document;
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

	public Address getPermanentAddress() {
		return permanentAddress;
	}

	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}

	public Address getTemporaryAddress() {
		return temporaryAddress;
	}

	public void setTemporaryAddress(Address temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}

	public List<Authority> getAllAuthorities() {
		return allAuthorities;
	}

	public void setAllAuthorities(List<Authority> allAuthorities) {
		this.allAuthorities = allAuthorities;
	}

	public Project getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(Project projectInfo) {
		this.projectInfo = projectInfo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((allAuthorities == null) ? 0 : allAuthorities.hashCode());
		result = prime * result + bankAccount;
		result = prime * result + ((designation == null) ? 0 : designation.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((permanentAddress == null) ? 0 : permanentAddress.hashCode());
		result = prime * result + ((projectInfo == null) ? 0 : projectInfo.hashCode());
		result = prime * result + salary;
		result = prime * result + ((temporaryAddress == null) ? 0 : temporaryAddress.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (allAuthorities == null) {
			if (other.allAuthorities != null)
				return false;
		} else if (!allAuthorities.equals(other.allAuthorities))
			return false;
		if (bankAccount != other.bankAccount)
			return false;
		if (designation == null) {
			if (other.designation != null)
				return false;
		} else if (!designation.equals(other.designation))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (empId != other.empId)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (permanentAddress == null) {
			if (other.permanentAddress != null)
				return false;
		} else if (!permanentAddress.equals(other.permanentAddress))
			return false;
		if (projectInfo == null) {
			if (other.projectInfo != null)
				return false;
		} else if (!projectInfo.equals(other.projectInfo))
			return false;
		if (salary != other.salary)
			return false;
		if (temporaryAddress == null) {
			if (other.temporaryAddress != null)
				return false;
		} else if (!temporaryAddress.equals(other.temporaryAddress))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", email=" + email + ", bankAccount=" + bankAccount
				+ ", designation=" + designation + ", salary=" + salary + ", permanentAddress=" + permanentAddress
				+ ", temporaryAddress=" + temporaryAddress + ", allAuthorities=" + allAuthorities + ", projectInfo="
				+ projectInfo + "]";
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.empId - o.empId;
	}
	
	
	
	

}
