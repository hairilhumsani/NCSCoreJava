package p1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		
		/* no specific reason , just a Random Class */
		
		File f = new File("c:\\myfile.txt");
		
		try {
			f.getCanonicalFile();
		} catch (Exception e) {
			System.out.println("Runtime issue .. contact to customer care ...");
		}
		
		
		
		
		
	}

}
