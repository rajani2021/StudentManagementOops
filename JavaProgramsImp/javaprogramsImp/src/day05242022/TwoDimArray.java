package day05242022;

import java.util.Scanner;

public class TwoDimArray {

	public static void main(String[] args) {
		System.out.println("main method starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size1: ");
		int size1 = sc.nextInt();
		System.out.println("Enter size2: ");
		int size2 = sc.nextInt();
		int a[][] = new int[size1][size2];
		System.out.println("Enter values for "+size1+"X"+size2+" matrix");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				int value = sc.nextInt();
				a[i][j] = value;
			}
		}
		System.out.println(size1+"X"+size2+" matrix is: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("main method ends");
	}

}
