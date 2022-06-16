//Read the value from user till enters any negative number
package assignment;

import java.util.Scanner;

public class DoWhileExample {
	public static void main(String[] args) {
		System.out.println("Main method starts");
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Enter n value: ");
			n = sc.nextInt();
			System.out.println("Entered n value is : "+n);
		}while(n>=0);
		
	}
}
