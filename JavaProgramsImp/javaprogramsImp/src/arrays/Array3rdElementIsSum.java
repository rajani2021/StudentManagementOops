package arrays;

import java.util.Scanner;

public class Array3rdElementIsSum {

	public static void main(String[] args) {
		System.out.println("enter n value : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" array elements : ");
		for (int i = 0; i <= n; i++) {
			arr[i] = sc.nextInt();
			arr[i+1] = sc.nextInt();
			arr[i+2] = arr[i-0]+arr[i-1];
			
		}
		System.out.println("Array Elements are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
