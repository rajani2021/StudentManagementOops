package nal;

public class StringConcat {

	public static void main(String[] args) {
		
		int a= 100;
		int b = 200;
		String s1 = "Hello";
		String s2 = "World";
		double c = 12.33;
		double d = 10.33;
		System.out.println("a+b = "+(a+b));
		System.out.println("s1+s2 = "+(s1+s2));
		System.out.println("a+b+s1+s2 = "+(a+b+s1+s2));//300HelloWorld
		System.out.println("a+s1+s2+b = "+(a+s1+s2+b));//100HelloWorld200
		System.out.println("s1+s2+a+b = "+(s1+s2+a+b));//HelloWorld100200
		System.out.println("s1+s2+a+b = "+(s1+s2+(a+b)));//HelloWorld300
		System.out.println("a+b+s1+s2+a+s1+b+s2 = "+(a+b+s1+s2+a+s1+b+s2));//300HelloWorld100Hello200World
		System.out.println("a+b+s1+s2+a+b = "+(a+b+s1+s2+a+b));//300HelloWoreld100200
		System.out.println("c+d = "+(c+d));
		System.out.println("s1+s2+c+d = "+(s1+s2+c+d));//HelloWorld12.3310.33		
		
	}

}
