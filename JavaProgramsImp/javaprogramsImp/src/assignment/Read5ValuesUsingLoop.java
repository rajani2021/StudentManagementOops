package assignment;

import java.util.Scanner;

public class Read5ValuesUsingLoop {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter Input : ");
			n = sc.nextInt();
			System.out.print(n);
		}
	}

}
