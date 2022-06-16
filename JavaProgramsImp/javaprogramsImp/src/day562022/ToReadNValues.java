package day562022;

import java.util.Scanner;

public class ToReadNValues {
	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			int a;
			System.out.println("Enter the value :");
			a = sc.nextInt();
			System.out.println("Entered value is : " + a);
		}
		System.out.println("main method ends");
	}
}
