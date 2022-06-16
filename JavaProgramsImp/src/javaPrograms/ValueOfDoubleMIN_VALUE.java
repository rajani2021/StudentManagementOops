package javaPrograms;

public class ValueOfDoubleMIN_VALUE {

	public static void main(String[] args) {
		System.out.println(Double.MIN_VALUE);// 4.9E-324, positive number
		System.out.println(Long.MIN_VALUE);// -9223372036854775808, negative number
		System.out.println(Integer.MIN_VALUE);// -2147483648, negative number
		System.out.println(Float.MIN_VALUE);//1.4E-45, positive number
		System.out.println("----------------------------------------------------");
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));//0.0
		System.out.println(Math.min(Long.MIN_VALUE, 0));//-9223372036854775808
		System.out.println(Math.min(Integer.MIN_VALUE, 0));//-2147483648
		System.out.println(Math.min(Float.MIN_VALUE, 0.0f));//0.0
		System.out.println("----------------------------------------------------");
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));//-Infinity
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));//0.0
	}

}
