package p5;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable
{
	private static final long serialVersionUID = 42L;
	private int empId;
	private String name;
	private int salary;
	private transient Laptop laptop;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	/*
	private void writeObject(ObjectOutputStream oos)throws Exception
	{
		oos.defaultWriteObject();
		oos.writeInt(laptop.getLaptopNumber());
		System.out.println("Laptop id is saved");
	}
	*/
	private void readObject(ObjectInputStream ois)throws Exception
	{
		System.out.println("laptop isbeing read");
		ois.defaultReadObject();
		
		this.setLaptop(new Laptop(ois.readInt()));
	}
	
	
	
	

}
