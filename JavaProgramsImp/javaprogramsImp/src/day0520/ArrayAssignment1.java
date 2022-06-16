package day0520;

import java.util.Scanner;

public class ArrayAssignment1 {
	public static void main(String[] args) {
		System.out.println("Enter the size of an array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Multiples of 10 : ");
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			if(i == 0) {
				System.out.println(a[i]+= 10);
			}if(i!=0) {
				System.out.println(a[i]*10+10);
			}
		}
	}
}