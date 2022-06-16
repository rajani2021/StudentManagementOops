package j1130am;

import java.util.Scanner;

public class TernaryOpLargestOfFour {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for a : ");
		int a = sc.nextInt();
		System.out.println("Enter value for b : ");
		int b = sc.nextInt();
		System.out.println("Enter value for c : ");
		int c = sc.nextInt();
		System.out.println("Enter value for d : ");		
		int d = sc.nextInt();
		
		//int res = (a>b && a>c && a>d) ? a : (b>c && b>d) ? b : (c>d)? c : d;
		
		int big=(a > b) ? a:b;
	    big=(big>c) ? big:c;
		big=(big>d) ? big:d;
		
		System.out.println("Biggest number is  = "+big);
	}

}
