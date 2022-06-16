//WAP to print 1 to n; n must be read from user

package loop05052022;

import java.util.Scanner;

public class NumberFron1ToN {

	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n;
		System.out.println("Numbers from 1 to "+ ":");
		for (int i = 1; i <= 5; i++) {
			n = sc.nextInt()	;	
			System.out.println(n);}		
		System.out.println("main method ends");
	}

}
