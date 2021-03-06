package day0517;

import java.util.Scanner;

public class ReturnStringIndex {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter a String: ");
		String string1 = input.next();
		System.out.print("Please enter a second String: ");
		String string2 = input.next();
		if (isSubstring(string1, string2)) {
			System.out.println("The first string is a substring of the second.");
		} else {
			System.out.println("The first string is NOT a substring of the second.");
		}
	}	
	public static boolean isSubstring(String string1, String string2) {
		char c;
		char d;
		boolean match = true;
		for (int i = 0; i < string1.length(); i++) {
			c = string1.charAt(i);
			for (int j = 0; j < string2.length(); j++) {
				d = string2.charAt(j);
				if (d != c) {
					match = false;
					System.out.println("MATCH: N The value of c and d: " + c + " and " + d);	
				} else {
					System.out.println("MATCH: Y The value of c and d: " + c + " and " + d);
				}
				match = true;	
			}
		}
		return match;
	}
}
