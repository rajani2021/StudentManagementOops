package assignment;

import java.util.Scanner;

public class CountEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int evenCounter = 0;
		int oddCounter = 0;
		int a;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the number : ");
			a = sc.nextInt();
			int dummy = (a%2 == 0)?evenCounter++:oddCounter++;
		}
		System.out.println("Even Number Count = "+evenCounter);
		System.out.println("Odd Number Count = "+oddCounter);
	}

}
