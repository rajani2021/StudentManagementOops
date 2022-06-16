package day0510;

import java.util.Scanner;

public class DisplayEvenAndOddNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		int newRem = 0;
		while(n!=0) {
			int rem = n%10;
			n = n/10;
			newRem = rem%2;
			if(newRem==0)
				System.out.print(rem+" is Even Number");
			else
				System.out.println();
				System.out.print(rem+" is Odd Number");
				//System.out.println();
		}
	}
}
