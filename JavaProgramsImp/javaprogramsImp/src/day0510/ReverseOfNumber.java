package day0510;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		int newRem = 0;
		while(n!=0) {
			int rem = n%10;
			n = n/10;
			newRem = rem%2;
			System.out.print((newRem==0)?"Even Number is : "+rem +"\n": "Odd Number is : "+rem +"\n");
		}
	}
}