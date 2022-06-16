package assignment;

import java.util.Scanner;

public class MultipleIfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of Subjects : ");
		int n = sc.nextInt();
		System.out.println("Enter Maths Score : ");
		int mathsScore = sc.nextInt();
		System.out.println("Enter Physics Score : ");
		int physicsScore = sc.nextInt();
		System.out.println("Enter Chemistry Score : ");
		int chemistryScore = sc.nextInt();
		int sum = mathsScore+physicsScore+chemistryScore;
		System.out.println("Sum of all 3 Subjects = "+sum);
		int avg = sum / n ;
		System.out.println("Average = "+avg);
		if(avg >= 80) {
			System.out.println("FCD");
		}
		else if(avg>=60 ){
			System.out.println("1ST CLASS");
		}
		else if(avg >= 50) {
			System.out.println("2nd class");
		}
		else if(avg >= 35) {
			System.out.println("PASS");
		}
		else {
			System.out.println("fail");
		}
	}
}