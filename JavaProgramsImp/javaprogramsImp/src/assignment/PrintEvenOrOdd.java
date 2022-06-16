package assignment;

import java.util.Scanner;

public class PrintEvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int n = sc.nextInt();
		System.out.println(n);
		int input;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number to determine even or odd : ");
			input = sc.nextInt();
			System.out.println("The number is : "+(input % 2 == 0 ? "even" : "odd"));
		}
	}

}
