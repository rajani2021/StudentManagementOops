package assignment;

import java.util.Scanner;

public class FiveDifferentDtsLocal {

	public static void main(String[] args) {
		float f;
		long l;
		double d;
		char ch;
		boolean bool;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for float f : ");
		f = sc.nextFloat();
		System.out.println("Entered value of f is : "+f);
		System.out.println("Enter value for double d : ");
		d = sc.nextDouble();
		System.out.println("Entered value of d is : "+d);
		System.out.println("Enter value for long l : ");
		l = sc.nextLong();
		System.out.println("Entered value for long l : "+l);
		System.out.println("Enter value for char ch : ");
		ch = sc.next().charAt(0);
		System.out.println("Entered value of ch is : "+ch);
		System.out.println("Enter value for boolean bool : ");
		bool = sc.nextBoolean();
		System.out.println("Entered value boolean bool is : "+bool);
	}

}
