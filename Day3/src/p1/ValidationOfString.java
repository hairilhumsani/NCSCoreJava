package p1;

import java.util.Scanner;

public class ValidationOfString {
	
	public static void main(String[] args) {
		
		String validDomains[] = {"gmail","yahoo","linkedin"};
		
		String email = new Scanner(System.in).nextLine();	
		
		/*
		 * username should be more than 1 char
		 * must have @
		 * must have validDomains
		 * */
		
		String arr[] = email.split("@");
		
		boolean isValidusername = arr[0].length()>1;
		boolean isSymbolChar = arr.length > 0; // email.contains("@");
		boolean isValidDomain = false;
		
		for (String domains : validDomains) {
			if(arr[1].contains(domains))
			{
				isValidDomain = true;
				break;
			}
		}
		
		
		System.out.println(isSymbolChar && isValidDomain && isValidusername);
		
		
		
		
	}

}
