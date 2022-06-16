package assignment;

import java.util.Scanner;

public class CountDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int digit= 0;
		System.out.println("Entered number is : "+number);
		for (; number!=0; digit++) {
			number = number/10;
		}
		System.out.println("Number of digits : "+digit);
	}
}