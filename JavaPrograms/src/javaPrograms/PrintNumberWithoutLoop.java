package javaPrograms;

import java.util.stream.IntStream;

public class PrintNumberWithoutLoop {

	public static void main(String[] args) {
		printNumber(1);
		printNumber(1,100);
		System.out.println("*********************************");
		IntStream.range(1, 101).forEach(e ->System.out.println(e));
	}
	
	public static void printNumber(int num) {
		if(num<=100) {
			System.out.println(num);
			num++;
			printNumber(num);
		}
	}	
	
	public static void printNumber(int startNum, int endNum) {
		if(startNum<=endNum) {
			System.out.println(startNum);
			startNum++;
			System.out.println("*******************************");
			printNumber(startNum);
		}
	}
}
