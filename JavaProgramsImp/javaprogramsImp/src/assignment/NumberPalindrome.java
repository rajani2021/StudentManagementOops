package assignment;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int num = sc.nextInt();
		int actual = num;
		System.out.println("Entered Number is : "+num);
		int reverse = 0;
		while (num!=0) {
			int rem = num%10;
			num = num/10;
			reverse = (reverse*10)+rem;
			System.out.println("reverse = "+reverse);
			System.out.println("rem = "+rem);
			System.out.println("num = "+num);
		}
		System.out.println("reverse number = "+reverse);
		System.out.println("number = "+num);
		System.out.println("number is Palindrome : "+(reverse == actual?"true":false));
		
	}

}
