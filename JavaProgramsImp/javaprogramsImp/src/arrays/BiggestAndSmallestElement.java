package arrays;

import java.util.Scanner;

public class BiggestAndSmallestElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter array values : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered Array Values are : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		int max = returnMax(arr);
		int min = returnMin(arr);
		
		System.out.println("Max value is : "+max);
		System.out.println("Min value is : "+min);
	}
	
	public static int returnMax(int arr[]) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int returnMin(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
}
