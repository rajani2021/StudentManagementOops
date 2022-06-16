package j1130am;

import java.util.Scanner;

public class TernaryOpLargestOfThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a : ");
		int a = sc.nextInt();
		System.out.println("Enter value for b : ");
		int b = sc.nextInt();
		System.out.println("Enter value for c : ");
		int c = sc.nextInt();
		
		int res = (a>b && a>c) ? a : (b>c) ? b : c;

		System.out.println("Biggest number is  = "+res);
	}

}
