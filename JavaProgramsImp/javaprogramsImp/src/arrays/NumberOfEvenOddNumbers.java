package arrays;

import java.util.Scanner;

public class NumberOfEvenOddNumbers {
	static int ecount = 0;
	static int ocount = 0;
	public static void main(String[] args) {
		System.out.println("enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" array elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2 == 0) {
				ecount++;
			} else {
				ocount++;
			}
		}
		System.out.println("Ecount = "+ecount+"\nOcount = "+ocount);
	}
}
