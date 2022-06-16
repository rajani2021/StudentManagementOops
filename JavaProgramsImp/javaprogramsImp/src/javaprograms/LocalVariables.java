package javaprograms;

public class LocalVariables {
	static int k = 100;

	public static void main(String[] args) {
		int a;//declared
		a=1;//initialized
		int b=2;
		int c=3;
		System.out.println("a = "+a+ "  b = "+b+"  c = "+c);	
		System.out.println("start");
		b = 123;
		c = 789;
		System.out.println("a = "+a+ "  b = "+b+"  c = "+c);
		System.out.println("main k = "+k);
		{
			int d =637;
			System.out.println("d = "+d);
			System.out.println("inside block k = "+k);
		}
		System.out.println("end");
	}
}