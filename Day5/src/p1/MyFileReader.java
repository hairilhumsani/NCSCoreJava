package p1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MyFileReader {
	
	public static void main(String[] args) {
		
		
		String rootPath = "C:\\Users\\Hp\\Desktop\\NCS Singapore\\Day5\\src\\p1\\";
		String fileName = "IoDemo.java";
		File f = new File(rootPath+fileName);
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = "";
			
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}

}
