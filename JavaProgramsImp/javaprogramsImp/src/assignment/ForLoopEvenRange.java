package assignment;

import java.util.Scanner;

public class ForLoopEvenRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m = sc.nextInt();
		m = (m % 2 == 0 ? m : m + 1);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Enteted n value is : " + n);
		for (int i = m; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
