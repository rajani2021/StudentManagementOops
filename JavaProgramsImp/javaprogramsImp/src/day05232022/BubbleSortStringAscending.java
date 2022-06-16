package day05232022;

import java.util.Scanner;

public class BubbleSortStringAscending {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		String a[] = new String [size];
		int i = 0;
		for (; i < a.length; i++) {
			System.out.println("Enter value at index "+i+" : ");
			String value = sc.next();
			a[i] = value;
		}
		System.out.println("Array Elemets are : ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		for (int j = 0; j < a.length-1; j++) {
			for (int k = 1; k < a.length; k++) {
				if((a[k].compareTo(a[k-1]))<0) {
					String temp = a[k];
					a[k]= a[k-1];
					a[k-1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("String Sorted Ascending : ");
		for (String value:a) {
			System.out.println(value);
		}
	}

}
