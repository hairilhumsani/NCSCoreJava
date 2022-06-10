package p1;

import java.io.File;

public class IoDemo {
	
	public static void main(String[] args) {
		
		String rootPath = "C:\\Users\\Hp\\Desktop\\NCS Singapore\\";
		String fileName = "DemoFile.txt";
		File f = new File(rootPath+fileName);
		
		boolean isFileExist = false;
		System.out.println(f.exists());
		
		try {
			isFileExist = f.createNewFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(isFileExist);
		
		
		System.out.println(" Code ends here ");
		
		
	}

}
