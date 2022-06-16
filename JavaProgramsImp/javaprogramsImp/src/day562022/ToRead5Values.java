package day562022;

import java.util.Scanner;

public class ToRead5Values {
	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		int a;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter the value :");
			a = sc.nextInt();
			System.out.println("Entered value is : "+a);
		}
		System.out.println("main method ends");
	}
}
