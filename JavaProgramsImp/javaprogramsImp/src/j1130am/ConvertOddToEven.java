package j1130am;

import java.util.Scanner;

public class ConvertOddToEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = sc.nextInt();
		int res = (n%2 == 1)? n+1:n;
		System.out.println("res = "+res);
	}
}