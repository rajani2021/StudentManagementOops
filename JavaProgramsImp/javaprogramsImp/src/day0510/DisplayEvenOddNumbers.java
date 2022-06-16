package day0510;

import java.util.Scanner;

public class DisplayEvenOddNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		
		int n = sc.nextInt();
		int orig = n;
		int rev = 0;
		while(n!=0) {
			int rem = n%10;
			n = n/10;
			rev = rev*10+rem;
		}
		System.out.println("Reversed Number is : "+rev);
		System.out.println((orig==rev)?"Palindrome":"Not a Palindrome");
	}
}
