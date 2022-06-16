package day0518;

import java.util.Scanner;

public class CountCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str = sc.next();
		char ch = 'a';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch && str.charAt(i)!=' ') 
				count++;
		}
		System.out.println("count = "+count);
	}
}