package day0520;
import java.util.Scanner;
public class LowestandBiggest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		int size = sc.nextInt();
		int a[] = new int [size];
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
		System.out.println("lowest element = "+ lowestElement(a));
		System.out.println("biggest element = "+ biggestElement(a));
	}
	public static int lowestElement(int a[]) {
		int lowest = a[0];
		for (int j = 1; j < a.length; j++) {
			if(a[j]<lowest) {
				lowest = a[j];
			}
		}
		return lowest;
	}
	public static int biggestElement(int a[]) {
		int biggest = a[0];
		for (int j = 1; j < a.length; j++) {
			if(a[j]>biggest) {
				biggest = a[j];
			}
		}
		return biggest;
	}
	
}
