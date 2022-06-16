package day15;
import java.util.Scanner;

public class SwitchToReadInput {
	public static void main(String[] args) {
		System.out.println("Main method starts");
		int choice=0;
		do{
		System.out.println("Enter 1 value for prime"+"\n"+ "2 for factorial: "+"\n"+"3 to exit");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
			switch(choice){
				case 1: System.out.println("Execute Prime");
							int dummy;
							boolean flag = false;
							Scanner scan= new Scanner(System.in);
							System.out.println("Enter any number:");
							int d=scan.nextInt();
							for(int k=2;k<=d/2;k++)
							{
								dummy=d%k;
								if(dummy==1)
								{
									flag =true;
								}

							}
							if(flag){
								System.out.println("Prime");
							}else{
								System.out.println("Not Prime");
							}
						break;
				case 2: System.out.println("Factorial Number");
						int fact = 1;//Factorial of 0 is initialized to 1
						System.out.println("Enter n value : ");
						int m = sc.nextInt();
						for (int j = 1; j <= m; j++) {
							fact = fact*j;
						}
					System.out.println("Factorial of "+m+" is : "+fact);
						break;
				case 3: System.out.println("Exiting");
						break;
			}
			choice++;
		}while(choice==3);
	}
}
