package p1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {
	
	public static void main(String[] args) {
		
		int arr[] = new int[5];
		 // used to read data from file 
		try (BufferedReader br = new BufferedReader(new FileReader("")))
		{
			System.out.println("inside try , do reading from file src ");
			int x = arr[1];
		}
		catch (Exception e) {
			System.out.println("inside catch");
		}
		finally
		{
			
		}
		
		
		
		
	}

}
