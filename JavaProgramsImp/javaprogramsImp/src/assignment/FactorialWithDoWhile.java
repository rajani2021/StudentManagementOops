package assignment;

import java.util.Scanner;

public class FactorialWithDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, fact;
		do {
			System.out.println("Enter value for n : ");
			n = sc.nextInt();
			int temp = n;
			fact = 1;
			while(n>0) {
				fact = fact*n;
				n--;
			}
			System.out.println((temp>0)?"The factorial of "+temp+" is:"+fact:"");
		}
		while(n>0);	
	}
}