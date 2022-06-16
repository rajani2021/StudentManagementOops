package assignment;

import java.util.Scanner;

public class ForLoopEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Enteted n value is : " + n);
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
