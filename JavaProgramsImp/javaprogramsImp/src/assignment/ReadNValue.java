package assignment;

import java.util.Scanner;

public class ReadNValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int n = sc.nextInt();
		System.out.println("Entered Number is : "+n);
		System.out.println("------------------");
		for (int i = 0; i<=n; i++) {
				System.out.println(i);
		}
	}

}
