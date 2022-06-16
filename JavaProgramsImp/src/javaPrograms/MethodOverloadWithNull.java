package javaPrograms;

public class MethodOverloadWithNull {
	public static void main(String[] args) {
		test(null);
	}
	
	public static void test(Object o) {
		System.out.println("Object Argument");
	}
	
	/*
	 * public static void test(String s) { System.out.println("String Argument"); }
	 */
	
	public static void test(StringBuffer sb) {
		System.out.println("StringBuffer Argument");
	}
	
	
}
