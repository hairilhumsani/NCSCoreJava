package p1;

public class DemoStringBuffer {
	
	public static void main(String[] args) {
		
		String str = "mike";
		str.concat(" works");
		System.out.println(str); // mike
		
		
		StringBuffer sb = new StringBuffer("mike");
		sb.append(" works");
		System.out.println(sb);
		
		
	}

}
