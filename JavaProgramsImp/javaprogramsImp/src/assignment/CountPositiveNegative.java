package assignment;

import java.util.Scanner;

public class CountPositiveNegative {

	public static void main(String[] args) {
		int positiveCounter = 0;
		int negativeCounter = 0;
		int j = 0;
		int var = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		System.out.print(n);
		for (int i = 0; i < n; i++) {
			System.out.print("Enter Input Value: ");
			j = sc.nextInt();
			/*
			 * if(j >= 0) { positiveCounter++; }else { negativeCounter++; }
			 */
			var = (j >= 0) ? positiveCounter++ : negativeCounter++;
		}
		System.out.println("Var = " + var);
		System.out.println("Positive Values are : " + positiveCounter);
		System.out.println("Negative Values are : " + negativeCounter);
	}
}
