package p1;


import java.util.*;

public class BasicDemo4 {
	
	public static void main(String[] args) {
		
		//listDemo();
		setDemo();
		
	}

	public static void listDemo()
	{
		List<String> countries = new ArrayList<>();
		
		countries.add("Singapore");
		countries.add("Hong Kong");
		countries.add("Malaysia");
		countries.add("Thailand");
		System.out.println(countries.get(0));
		System.out.println(countries.get(3));
		countries.add(2,"Indonesia");
		System.out.println(countries);
		System.out.println(countries.size());

		Object arr[] = (countries.toArray());
		
		List<String> southAsianCountry = new ArrayList<>();
		southAsianCountry.add("India");
		southAsianCountry.add("Nepal");
		southAsianCountry.add("Sri lanka");
			
		countries.addAll(southAsianCountry);
		
		List<String> middleEastCountries = new ArrayList<>();
		middleEastCountries.add("UAE");
		middleEastCountries.add("Saudi Arebia");
		middleEastCountries.add("Oman");
		
		countries.addAll(middleEastCountries);
		
		
		System.out.println("============================");
		System.out.println(countries);
		System.out.println(countries.size());

		String x = countries.remove(0);
		System.out.println(countries.size());
		System.out.println(x);
		
		boolean y = countries.remove("India");
		System.out.println(countries.size());
		System.out.println(y);
		
		
		
		
	}

	public static void setDemo()
	{
		Set<Integer> set  = new TreeSet<>();
		
		set.add(45);
		set.add(35);
		set.add(79);
		set.add(14);
		
		System.out.println(set);
		
		
	}
	
}
