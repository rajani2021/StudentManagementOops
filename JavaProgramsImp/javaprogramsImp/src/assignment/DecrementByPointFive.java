package assignment;

import java.util.Scanner;

public class DecrementByPointFive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		double num = sc.nextDouble();
		System.out.println("Entered Number is : "+num);
		while(num!=0) {
			System.out.println("Number after reducing 0.5 is : "+num);
			num -=0.5;
		}
	}
}