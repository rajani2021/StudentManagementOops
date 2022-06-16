package day0510;
import java.util.Scanner;
public class DiamondStarPattern {

	public static void main(String[] args)	{

		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		//Upper Triangle
		for (int i = 1; i < n; i++) {
			for (int j = n; j >= 1; j--) {
				System.out.print((i>=j)?"* ":' ');
			}
			System.out.println();
		}
		//Lower Triangle
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				System.out.print((i>=j)?"* ":' ');
			}
			System.out.println();
		}
	
	}
}
