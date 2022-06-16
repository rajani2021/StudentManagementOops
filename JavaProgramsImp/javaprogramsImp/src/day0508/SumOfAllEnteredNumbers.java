package day0508;
import java.util.Scanner;
class SumOfAllEnteredNumbers{
	public static void main(String[] args)
	{	
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter n value : ");
		int n = sc.nextInt();
		for(int i = 1;i <= n;i++)
		{
			System.out.println("enter value to add : ");
			int a = sc.nextInt();
			sum += a;
		}
		System.out.println("Addition of entered numbers is : "+sum);
	}	
}	