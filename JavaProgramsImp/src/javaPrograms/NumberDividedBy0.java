package javaPrograms;

public class NumberDividedBy0 {

	public static void main(String[] args) {
		System.out.println(9.0/0);//Infinity
		System.out.println(19.01f/0);//Infinity
		System.out.println(19/0.0);//Infinity
		System.out.println(19.9999/0.0);//Infinity
		System.out.println(0.0/0);//Nan
		System.out.println(0.0/0.0);//Nan
		System.out.println(12.33/0.0);//Infinity
	}

}
