package day05092022;

import java.util.Scanner;

public class StarPattern3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print(((i==j)&&((i+j)%n == 1))? " ":j);
			}
			System.out.println();
		}
	}
}