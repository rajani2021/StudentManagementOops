package day05232022;

import java.util.Scanner;

public class BubbleSortStringAscending2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int [size];
		int i = 0;
		boolean found;
		for (; i < a.length; i++) {
			System.out.println("Enter value at index "+i+" : ");
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Array Elemets are : ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		
		for (int j = 0; j < a.length-1; j++) {
			for (int k = 1; k < a.length; k++) {
				if(a[k]<a[k-1]) {
					int temp = a[k];
					a[k]= a[k-1];
					a[k-1] = temp;
				}
			}
		}
		System.out.println("Post Bubble Sort : ");
		for (int value:a) {
			System.out.println(value);
		}
	}

}
