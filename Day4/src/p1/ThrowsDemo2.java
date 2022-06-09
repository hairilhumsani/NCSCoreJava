package p1;

import java.sql.SQLException;

public class ThrowsDemo2 
{

	public static void main(String[] args) {
		
		ThrowsDemo2 obj = new ThrowsDemo2();
		
		try {
			obj.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void method1() throws SQLException
	{
		System.out.println(" some code in method 1");
		
		method2();
		
	}
	
	public void method2() throws SQLException
	{
		
		System.out.println(" some code method 2");
		
		SQLException e = new SQLException();
		throw e;
		
		
	}
}
