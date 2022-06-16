package arrays;

import java.util.Scanner;

public class Mod {

	public static void main(String[] args) {
		/*
		 * System.out.println("enter a value "); Scanner sc = new Scanner(System.in);
		 * int a = sc.nextInt(); int mod = a/2; System.out.println(mod);
		 */
		int a = 10;
int b =a + ++a - a - ++a +a;
int c = ++a + ++b - b -a + ++a + 3;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
	}

}
