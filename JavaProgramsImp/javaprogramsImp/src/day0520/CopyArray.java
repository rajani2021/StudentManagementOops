package day0520;

import java.util.Scanner;

public class CopyArray {
	static int b[] = bb;

	public static void main(String[] args) {
		test();
	}
	
	public static int[] test() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i = 0;
		System.out.println("Enter array values :");
		for (; i < a.length; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Array Elemets are : ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		System.out.println("Enter size of 2nd array : ");
		int size2 = sc.nextInt();
		int[] bb= new int[size2];
		if (b.length > a.length) {
			for (int j = 0; j < a.length; j++) {
				b[j] = a[j];
			}
			System.out.println("2nd Array's elements are : ");
			for (int j = 0; j < b.length; j++) {
				System.out.println(b[j]);
			}
		} else {
			System.out.println("array b length is lesser than array a");
		}
		return b;
	}
}