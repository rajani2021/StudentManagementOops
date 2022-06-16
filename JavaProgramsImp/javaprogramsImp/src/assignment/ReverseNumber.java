package assignment;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int rev = 0;
		System.out.println("Entered number is : "+number);
		for (; number!=0;) {
			int remainder = number % 10;  
			rev = rev* 10  + remainder;
			number = number/10;
		}
		System.out.println("Reverse Number = "+rev);
	}
}