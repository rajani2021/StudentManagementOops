package assignment;

import java.util.Scanner;

public class PrintTheVarName {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a :");
		a = sc.nextInt();
		System.out.println("Entered value for a is : "+a);
		
		System.out.println("Enter value for b :");
		b = sc.nextInt();
		System.out.println("Entered value for b is : "+b);
		
		System.out.println("The bigger value is : "+((a > b)? 'a': 'b'));
	}
}