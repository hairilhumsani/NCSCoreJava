package p1;


class Laptop
{
	String brandName = "Lenovo";
	Camera c;
	public Laptop(Camera c) {
		super();
		this.c = c;
	}
	
	
}

class MobilePhone
{

	String brandName = "Lenovo";
	Camera c;
	public MobilePhone(Camera c) {
		super();
		this.c = c;
	}
}

class Camera
{
	
}

public class Demo1 
{
	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		Camera c  = new Camera();
		obj.doThings(c);
		obj.setMobilePhone(c);
		//Laptop abc = obj.doThings();
		
	}
	
	public void doThings(Camera c)
	{
		
		Laptop myLaptop = new Laptop(c);// #1
		
		
		// end of doThings task
		
		
		//return myLaptop;
	}
	
	
	public void setMobilePhone(Camera c)
	{
		MobilePhone abc = new MobilePhone(c);
	}
	

}//end class
