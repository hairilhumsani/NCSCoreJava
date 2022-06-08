package p1;

public class Demo {
	
	private int x = 10;
	
	public void changeX(int x)
	{
		this.x = x; 
	}

	public int getX()
	{
		return x;
	}
	
	public static void main(String[] args) {
		Demo d = new Demo();
		d.changeX(80);
		System.out.println(d.getX());
	}
}
