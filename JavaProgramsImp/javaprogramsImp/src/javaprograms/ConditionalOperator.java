package javaprograms;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		//for (int i = 0; i <= 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter value for a : ");
			int a = sc.nextInt();
			System.out.println("Enter value for b : ");
			int b = sc.nextInt();
			int d = (a > b ? a : b);
			System.out.println("d = " + d);
		//}
	}
}
