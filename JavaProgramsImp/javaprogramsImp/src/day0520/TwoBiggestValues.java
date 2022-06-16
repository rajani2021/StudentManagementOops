package day0520;

import java.util.Scanner;

public class TwoBiggestValues {

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
		System.out.println("2 Biggest Values are : ");
		int firstBiggest = 0;
		int secondBiggest = 0;
	for(int j = 0; j < a.length; j++){
        if(a[j] > firstBiggest){
        	secondBiggest = firstBiggest;
            firstBiggest = a[j];
        }
        else if (a[j] > secondBiggest && a[j] != firstBiggest) {
        	secondBiggest = a[j];
        }
	}
	System.out.println(firstBiggest+ " 	"+ secondBiggest);
	}
}
