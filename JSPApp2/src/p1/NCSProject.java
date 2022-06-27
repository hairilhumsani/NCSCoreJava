package p1;

public class NCSProject {
	
	private int id;
	private String name;
	private boolean deployed;
	private float year;
	public NCSProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	public int getId() {
		return id;
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







	public boolean isDeployed() {
		return deployed;
	}







	public void setDeployed(boolean deployed) {
		this.deployed = deployed;
	}







	public float getYear() {
		return year;
	}







	public void setYear(float year) {
		this.year = year;
	}







	@Override
	public String toString() {
		return "NCSProject [id=" + id + ", name=" + name + ", isDeployed=" + deployed + ", year=" + year + "]";
	}
	
	public boolean doSave()throws Exception
	{
		System.out.println(" --->> inside doSave "+this);
		// lot of code to add project 
		
		if(name.length()<3)
		{
			throw new Exception("Invalid Project Name");
		}
		
		return true;
	}

}
