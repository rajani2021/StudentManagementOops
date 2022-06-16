package day0508;
import java.util.Scanner;
class ProductOfAllEnteredNumbers{
	public static void main(String[] args)
	{	
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++)
		{
			System.out.println("enter value to add : ");
			int a = sc.nextInt();
			product *= a;
		}
		System.out.println("Addition of entered numbers is : "+product);
	}	
}	