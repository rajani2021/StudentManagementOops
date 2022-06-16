package assignment;
import java.util.Scanner;
public class CountEvenOddInNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number = sc.nextInt();
		int evenCounter = 0;
		int oddCounter = 0;
		System.out.println("Entered number is : "+number);
		for (; number!=0;) {
			int rem = number % 10;
			int dummy = (rem%2 == 0)?evenCounter++:oddCounter++;
			number = number/10;
		}
		System.out.println("Even Numbers : "+evenCounter);
		System.out.println("Odd Numbers : "+oddCounter);
	}
}