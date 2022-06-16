
package loop05052022;
import java.util.Scanner;

class EvenNumbersFromMToN {
public static void main (String args[]){
int r,i;
Scanner scan=new Scanner(System.in);
//create a scanner object for input
System.out.print("Enter the first number for the range: ");
int num1=scan.nextInt();//reads num1 from user
System.out.print("Enter the second number for the range: ");
int num2=scan.nextInt();//reads num2 from user
System.out.print("\nDisplay the even numbers between "+num1+" and "+num2+" are :");
for(i=num1; i<=num2; i++){ 
System.out.println(num1%2*2+2);
}
}
}