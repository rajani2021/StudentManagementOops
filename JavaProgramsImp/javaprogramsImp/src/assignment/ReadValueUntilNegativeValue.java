package assignment;

import java.util.Scanner;

public class ReadValueUntilNegativeValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i >= 0;) {
			System.out.print("Enter the number : ");
			i = sc.nextInt();
		}
	}
}