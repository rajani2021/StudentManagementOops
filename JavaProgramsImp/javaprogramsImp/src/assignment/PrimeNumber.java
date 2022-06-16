package assignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPrime = true;
		System.out.println("Enter value for n : ");
		int n = sc.nextInt();
		if (n > 0) {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
					break;
				}
			}
			System.out.println(n + " is " + (isPrime ? "a prime number" : "not a prime number"));

		} else {
			System.out.println("The number is not prime.");
		}
	}
	
	/*Shruthi's version
	 * boolean prime = true;
	 * if (num <= 0)
	 * 		sysout("not prime")
	 * else if (num!=2 && num%2==0)
	 * 		sysout("not prime. coz it's an even number")
	 * 
	 * else{
	 * for (int i = 3;i<=num/2; i++)
	 * 	{
	 * 		if(num%i == 0){
	 * 			prime = false;
	 * 			break;
	 * }
	 * }
	 * }
	 */
	
}