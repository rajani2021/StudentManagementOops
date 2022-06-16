//WAP to print even numbers 0 to n;

package loop05052022;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Even Numbers from 0 to "+n+ ":");
		for (int i = 0; i <= n; i+=2) {
			System.out.println(i);
		}		
		System.out.println("main method ends");
	}

}
