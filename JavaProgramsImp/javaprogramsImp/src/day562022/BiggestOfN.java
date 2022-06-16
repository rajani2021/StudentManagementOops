package day562022;

import java.util.Scanner;

public class BiggestOfN {

	public static void main(String[] args) {
		System.out.println("starts");
		Scanner sc = new Scanner(System.in);
		int b = 10;
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int a;
			System.out.println("enter values : ");
			a = sc.nextInt();
			System.out.println((a>b)?a:b);
		}
		
	}

}
