package day0520;

import java.util.Scanner;

public class CreateArrayReadValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int [size];
		int i = 0;
		for (; i < a.length; i++) {
			System.out.println("Enter value at index "+i+" : ");
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Array Elemets are : ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}


	}
}
