package assignment;

import java.util.Scanner;

public class Read5ValuesUsingLoop2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input : ");
		int n = sc.nextInt();
		System.out.print(n);
		for (int i = 0, j=1; i<=n && j<=5; i=i+2,j++) {
			//for (int j = 1; j < 5; j = j++) {
				System.out.println(i);
			//}
		}
	}

}
