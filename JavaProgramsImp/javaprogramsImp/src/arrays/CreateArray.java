package arrays;

import java.util.Scanner;

public class CreateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=i;
			System.out.println("arr["+i+"] = "+arr[i]);
		}
	}
}