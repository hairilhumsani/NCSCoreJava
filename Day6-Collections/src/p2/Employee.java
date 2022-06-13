package p2;

public abstract class Employee
{
		String name;
		int salary;
		int id;
		
		Employee()
		{
		//	System.out.println("Employee class constractor");
		}
		
		
		
		public Employee(String name, int salary, int id) {
			super();
			this.name = name;
			this.salary = salary;
			this.id = id;
		}



		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		abstract public int getSalary();



		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
		}
		
}