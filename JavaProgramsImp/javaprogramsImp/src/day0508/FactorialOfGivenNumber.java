package day0508;

import java.util.Scanner;

public class FactorialOfGivenNumber {
	public static void main(String[] args) {
		int fact0 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			fact0 = fact0*i;
		}
		System.out.println("Factorial of "+n+" is : "+fact0);
	}
}