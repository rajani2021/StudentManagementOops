package javaprograms;

public class NumberPalindrome {

	public static void main(String args[]){  

		  int r,sum=0,temp;    

		  int n=454;//It is the number variable to be checked for palindrome  

		  

		  temp=n;    

		  while(n>0){    
		   r=n%10;  //getting remainder for n 

		   n=n/10;

		   sum=(sum*10)+r;     

		  }    

		  if(temp==sum)    

		   System.out.println("number is palindrome  ");    

		  else    

		   System.out.println("not palindrome");    

		}  
}
