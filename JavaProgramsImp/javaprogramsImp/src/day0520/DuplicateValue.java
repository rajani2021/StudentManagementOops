package day0520;
import java.util.Scanner;
public class DuplicateValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int[size];
		int i = 0;
		System.out.println("Enter array values :");
		for (; i < a.length; i++) {
			int value = sc.nextInt();
			a[i] = value;
		}
		System.out.println("Array Elemets are : ");
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
		System.out.println("Duplicate values are :");
		for (int k = 0; k < a.length; k++) {
			for (int j = k + 1; j < a.length; j++) {
				if (a[k] == a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}