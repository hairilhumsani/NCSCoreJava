package p1;

public class StringSplitDemo {

	public static void main(String[] args) {
		
		String msg = "this is the java session on strings";
		String arr[] = msg.split("i");
		
		for (String str : arr) {
			System.out.println(str);
		}
		
		
		
	}
}
