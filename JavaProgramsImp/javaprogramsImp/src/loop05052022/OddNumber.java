//WAP to print odd numbers 1 to n;

package loop05052022;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Odd Numbers from 1 to "+n+ ":");
		for (int i = 1; i <= n; i+=2) {
			System.out.println(i);
		}		
		System.out.println("main method ends");
	}

}
