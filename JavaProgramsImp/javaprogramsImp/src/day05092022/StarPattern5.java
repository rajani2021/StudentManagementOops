package day05092022;

import java.util.Scanner;

public class StarPattern5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >=1; j--) {
				System.out.print((i >= j)?'*':' ');
			}
			System.out.println();
		}
	}
}