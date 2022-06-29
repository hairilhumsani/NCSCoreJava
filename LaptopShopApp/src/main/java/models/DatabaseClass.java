package models;

import java.util.ArrayList;
import java.util.List;

public class DatabaseClass {
	
	public static List<User> allUser = new ArrayList<User>();
	public static List<Product> allProduct = new ArrayList<Product>();
	
	static
	{
		String laptopBrand1 = "Dell Laptop";
		String laptopName1 = "Dell XPS 15";
		String processor1 = "i7";
		int price1 = 80000;
		String typeOfStorage1 = "TB HDD";
		int ramSize1 = 16;
		Product p1 = new Product(laptopBrand1,laptopName1,processor1,price1,typeOfStorage1,ramSize1);
		allProduct.add(p1);
		
		String laptopBrand2 = "Dell Laptop";
		String laptopName2 = "Dell XPS 15";
		String processor2 = "i7";
		int price2 = 80000;
		String typeOfStorage2 = "TB HDD";
		int ramSize2 = 16;
		Product p2 = new Product(laptopBrand2,laptopName2,processor2,price2,typeOfStorage2,ramSize2);
		allProduct.add(p2);
		
		String laptopBrand3 = "Dell Laptop";
		String laptopName3 = "Dell XPS 15";
		String processor3 = "i7";
		int price3 = 80000;
		String typeOfStorage3 = "TB HDD";
		int ramSize3 = 16;
		Product p3 = new Product(laptopBrand3,laptopName3,processor3,price3,typeOfStorage3,ramSize3);
		allProduct.add(p3);
	}
	
	public boolean addUser(User u)
	{
		allUser.add(u);
		return true;
	}
	
	public static boolean validateUser(String username,String password)
	{
		boolean result = false;
		for (User u : allUser)
		{
			if (u.getUsername().contains(username) & u.getPassword().contains(password))
			{
				result = true;
			}
		}
		return result;
	}
	
	public static String getUserForgot(String username,String question, String answer)
	{
		String result = null;
		for (User u : allUser)
		{
			if (u.getUsername().contains(username) & u.getSecurityQuestion().contains(question) & u.getSecurityAnswer().contains(answer))
			{
				result = u.getPassword();
			}
			else {
				result = "Error no such user";
			}
		}
		return result;
	}
	
	public static List<Product> getProductsByUser(String username,String password)
	{
		List<Product> productByUser = null;
		for (User u : allUser)
		{
			if (u.getUsername().contains(username) & u.getPassword().contains(password)) {
				productByUser = u.getPurchasedProducts();
			}
		}
		return productByUser;
	}
	
	public List<User> getAllUser()
	{
		return allUser;
	}
	
	public static List<Product> getAllProduct()
	{
		return allProduct;
	}
}
