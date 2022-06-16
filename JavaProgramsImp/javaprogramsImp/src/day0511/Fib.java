package day0511;

import java.util.Scanner;

public class Fib {
	public static void main(String args[]) {
		int n1 = 0, n2 = 1, n3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int number = sc.nextInt();

		for (int i = 0; i < number; i++) {
			System.out.print(n1+" ");
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

		/*
		 * while(number>=1) { System.out.println(n1); n3 = n1+n2; n1 = n2; n2 = n3;
		 * number--; }
		 */
	}
}
