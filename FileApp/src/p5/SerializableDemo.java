package p5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	
	String rootPath = "C:\\Users\\Hp\\Desktop\\NCS Singapore\\";
	String fileName = "EmpSer2.txt";
	File f = new File(rootPath+fileName);
	
	public static void main(String[] args) {
		SerializableDemo sd = new SerializableDemo();
		
		try {
			
			//Employee emp = new Employee(101,"Mike",2000);
			// sd.writeFile(emp);
			Employee e = sd.readFile();
			System.out.println(e);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void writeFile(Employee emp)throws Exception
	{
		
			
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeObject(emp);
			System.out.println("--- Employee Saved ----");
			
		
	}
	
	public Employee readFile()throws Exception
	{
		Employee e = null;
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		e = (Employee) ois.readObject();
		
		return e;
	}
	
	
	
	
}//end class
