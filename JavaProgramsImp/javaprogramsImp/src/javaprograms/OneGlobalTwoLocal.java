package javaprograms;

public class OneGlobalTwoLocal {
	static int a = 637;
	static int b;
	static int c;
	public static void main(String[] args) {
		System.out.println("a = "+a+ "  b = "+b+"  c = "+c);	
		System.out.println("start");
		b = 123;
		c = 789;
		System.out.println("a = "+a+ "  b = "+b+"  c = "+c);
		System.out.println("end");
	}
}