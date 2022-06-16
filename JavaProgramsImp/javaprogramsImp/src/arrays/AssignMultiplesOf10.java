package arrays;

import java.util.Scanner;

public class AssignMultiplesOf10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = i * 10;
				System.out.println("arr[" + i + "] = " + (arr[i]+10));
		}
	}
}