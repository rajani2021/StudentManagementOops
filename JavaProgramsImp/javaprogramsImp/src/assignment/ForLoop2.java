package assignment;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Enteted n value is : "+n);
		for (int i = 1; i <= n; i++) {
			System.out.println(i);
		}	
	}
}