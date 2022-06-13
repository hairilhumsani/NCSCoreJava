package task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MainClass2 {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		

		List<Employee> employees1 = new ArrayList<>();

		Employee e1 = new Employee("p1.1", 1234, 1);
		Employee e2 = new Employee("p1.2", 2323, 2);
		Employee e3 = new Employee("p1.3", 2113, 3);

		employees1.add(e1);
		employees1.add(e2);
		employees1.add(e3);

		List<Employee> employees2 = new ArrayList<>();

		Employee f1 = new Employee("p2.1", 5800, 4);
		Employee f2 = new Employee("p2.2", 8800, 5);
		Employee f3 = new Employee("p2.3", 4800, 6);

		employees2.add(f1);
		employees2.add(f2);
		employees2.add(f3);

		List<Employee> employees3 = new ArrayList<>();

		Employee g1 = new Employee("p3.1", 5821, 7);
		Employee g2 = new Employee("p3.2", 3424, 8);
		Employee g3 = new Employee("p3.3", 4563, 9);

		employees3.add(g1);
		employees3.add(g2);
		employees3.add(g3);

		Project p1 = new Project("P1");
		Project p2 = new Project("P2");
		Project p3 = new Project("P3");

		MainClass2 mc2 = new MainClass2();

		Map<Project, List<Employee>> projectInformation = new HashMap<>();
		projectInformation.put(p1, employees1);
		projectInformation.put(p2, employees2);
		projectInformation.put(p3, employees3);

		mc2.doEmployeeIteration(projectInformation);
		mc2.getProjectInfoById(projectInformation);
	}

	public void doEmployeeIteration(Map<Project, List<Employee>> map) {
		Iterator<Project> itr = map.keySet().iterator();
		while (itr.hasNext()) {
			Project key = itr.next();
			System.out.println(key + "\t-\t" + map.get(key));
		}

		System.out.println("\n--------Map Entry ------------\n");

		for (Entry<Project, List<Employee>> entry : map.entrySet()) {
			System.out.print(entry + " - " + entry.getKey() + " - " + entry.getValue() + "\n");
		}
	}
	
	public void getProjectInfoById(Map<Project, List<Employee>> map)
	{

		System.out.println("\n--------------------------\n");
		System.out.println("Enter Id number");
		int i = sc.nextInt();

		for (Entry<Project, List<Employee>> entry : map.entrySet()) {
			//System.out.print(entry + " - " + entry.getKey() + " - " + entry.getValue() + "\n");
			
			List<Employee> l = entry.getValue();
			Project p = new Project();
			for(Employee e : l)
			{
				if (e.getId() == i)
				{
					p=entry.getKey();
					System.out.println(p.getProjectName());
				}
			}
		}
	
	}

}

class Project {
	private String projectName;
	private Employee resourceTeam;
	
	Project()
	{
		
	};
	
	public Project(String projectName)
	{
		this.projectName = projectName;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Employee getResourceTeam() {
		return resourceTeam;
	}

	public void setResourceTeam(Employee resourceTeam) {
		this.resourceTeam = resourceTeam;
	}

}

class Employee {
	String name;
	int salary;
	int id;

	Employee() {
		// System.out.println("Employee class constractor");
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
	
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	};
	
	public int getId() {
		return id;
	};

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

}
