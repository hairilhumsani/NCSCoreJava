package p1;

public class StringsDemo {
	
	public static void main(String[] args) {
		
		String s1 ="Hello";
		String s2 ="Hello";
		String s5 = s1;
		
		
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		System.out.println("first "+(s1==s2));
		System.out.println("Second "+(s3==s4));
		
		
		s1.toUpperCase();
		System.out.println(s1);
		
		
	}

}//end class
