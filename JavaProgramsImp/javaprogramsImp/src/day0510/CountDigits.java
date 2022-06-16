package day0510;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		
		int n = sc.nextInt();
		int count=0;
		while(n!=0) {
			int rem = n%10;
			n = n/10;
			int dummy=((rem!=0)?count++:0);
		}
		System.out.println("Reversed Number is : "+count);
	}
}
