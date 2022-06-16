package day05242022;

import java.util.Scanner;

public class TwoDimArraySearchForKey {

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
		System.out.println("enter the key to be searched: ");
		int key = sc.nextInt();
		boolean keyFound = false;
		int i = 0;
		for (; i < a.length; i++) {
			for (int j=0; j < a[i].length; j++) {
				if(a[i][j]==key) {
					keyFound=true;
					break;
				}
			}
		}
		if(keyFound) {
			System.out.println("Key found");
		}else {
			System.out.println("Key Not found.");
		}
		System.out.println("main method ends");
	}
}