package javaPrograms;

public class Nan {

	public static void main(String[] args) {
		//Nan -> Not a Number
		System.out.println(2.0/0.0);
		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-1));
		System.out.println("*******************************************");
		//comparing 2 NaN
		
		System.out.println(Float.NaN == Float.NaN);
		System.out.println(Float.NaN != Float.NaN);
		
		System.out.println("********************************************");
		//if we use /, in place of % it gives true. Strange???!!!
		double nan=2.1%0;
		System.out.println((2.1%0)==nan);
		System.out.println(nan==nan);
	}

}
