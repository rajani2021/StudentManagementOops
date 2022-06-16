//WAP to print multiples of 3 upto n

package loop05052022;

import java.util.Scanner;

public class MultiplesOf3 {

	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		System.out.println("Multiples of 3 to "+n+ ":");
		for (int i = 3; i <= n; i+=3) {
			System.out.println(i);
		}		
		System.out.println("main method ends");
	}

}
