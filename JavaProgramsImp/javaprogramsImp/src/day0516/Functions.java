package day0516;

import java.util.Scanner;

public class Functions {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Main method starts");
		primeNumber();
		factorial();
		System.out.println("Main method ends");
	}

	public static void primeNumber() {
		System.out.println("Execute Prime");
		boolean isPrime = true;
		System.out.println("Enter any number:");
		int d = sc.nextInt();
		for (int k = 2; k <= d / 2; k++) {
			if (d%k == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("Number is Prime");
		} else {
			System.out.println("Number is not Prime");
		}
	}

	public static void factorial() {
		System.out.println("Factorial Number");
		int fact = 1;
		System.out.println("Enter n value : ");
		int m = sc.nextInt();
		for (int j = 1; j <= m; j++) {
			fact = fact * j;
		}
		System.out.println("Factorial of " + m + " is : " + fact);
	}
}
