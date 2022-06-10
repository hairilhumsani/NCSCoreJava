package p1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileWriter {

	public static void main(String[] args) {
		
		String rootPath = "C:\\Users\\Hp\\Desktop\\NCS Singapore\\";
		String fileName = "DemoFile1.txt";
		File f = new File(rootPath+fileName);
		
		FileWriter fw = null;
		PrintWriter pw = null;
		try
		{
			fw = new FileWriter(f,true);
		    pw = new PrintWriter(fw);
			
			pw.print("\n task3");
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		pw.flush();
		pw.close();
		System.out.println(" class ends here");
		
	}
}
