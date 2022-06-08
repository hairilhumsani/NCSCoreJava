package p1;

public class StringAPI {
	public static void main(String[] args) {
		
		String str = "0123456789";
		
		str = str.substring(3, 8); // 3 to 9
		System.out.println(str);
		
		
		String name = "   mike ";
		name = name.trim();
		String anothername = "MIKE";
		
		System.out.println(name+" "+name.length()+" - "+anothername);
		System.out.println("compare name :- "+(name == anothername));
		System.out.println("compare name :- "+(name.equals(anothername)));
		System.out.println("compare name :- "+(name.equalsIgnoreCase(anothername)));
		
		
		
		
		System.out.println(name.length());
		
		
		
		String email = "mike@gmail.com";
		
		boolean x = email.contains("@");
		System.out.println(x);
		
		System.out.println(email.startsWith("mike"));
		System.out.println(email.endsWith(".com"));
		
		
		
		
		
		
	}

}
