package day05242022;

import java.util.Scanner;

public class SumOfTwoValues3rdIndex {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Eneter array values : ");
		for (int k = 0; k < a.length; k++) {
			if ((k+1) % 3 == 0) {
				a[k] = a[k - 1] + a[k - 2];
			}else {
				a[k]=sc.nextInt();
			}
		}
		
		System.out.println("Array values after adding 1st and 2nd values : ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}
}