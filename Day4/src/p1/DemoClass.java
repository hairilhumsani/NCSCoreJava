package p1;

class ABC
{
	/*
	public void doThings(int f)
	{
		System.out.println("int version");
	}
	
	public void doThings(short f)
	{
		System.out.println("Short version");
	}
	
	public void doThings(Byte f)
	{
		System.out.println("Byte version");
	}
	*/
	public void doThings(byte... a)
	{
		System.out.println("var args....");
		for (int i : a) {
			System.out.println(i);
		}
	}
	

}


public class DemoClass {

	public static void main(String[] args) {
		byte b = 15;
		new ABC().doThings(b);
		
		

		
		
	}
}
