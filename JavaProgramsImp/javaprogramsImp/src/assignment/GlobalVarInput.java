package assignment;

import java.util.Scanner;

public class GlobalVarInput {
	static int a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a :");
		a = sc.nextInt();
		System.out.println("Entered value for a is : "+a);
	}

}
