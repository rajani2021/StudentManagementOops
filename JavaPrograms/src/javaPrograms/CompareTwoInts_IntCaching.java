package javaPrograms;

public class CompareTwoInts_IntCaching {

	public static void main(String[] args) {
		Integer num1 = 100;
		Integer num2 = 100;
		//Integer Caching happens b/w -128 to 127. Here if we give input > 128, program prints Not equal
		if(num1 == num2) {
			System.out.println("Numbers are equal");
		}else {
			System.out.println("Numbers are not equal");
		}
		
	}

}
