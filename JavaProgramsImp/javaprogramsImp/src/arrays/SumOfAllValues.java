package arrays;

import java.util.Scanner;

public class SumOfAllValues {
	static int sum = 0;
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
		System.out.print("Sum of Array Elements is : ");
		for (int j = 0; j < arr.length; j++) {
			sum+=arr[j];
		}
		System.out.println(sum);
	}
}
