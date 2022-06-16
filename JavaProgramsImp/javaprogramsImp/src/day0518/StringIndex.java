package day0518;

import java.util.Scanner;

public class StringIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "core java rejava";
		String substr = "rejava";
		System.out.println("Main method starts");
		int index = stringIndex(str, substr,8);
		System.out.println("index = " + index);
		System.out.println("Main method ends");
	}

	public static int stringIndex(String str, String sub, int index) {
		int count = 0;
		int i = 0;
		for (i = index; i < str.length(); i++) {
			if (count == sub.length()) {
				break;
			}
			if (sub.charAt(count) == str.charAt(i)) {
				count++;
			}
		}
		if (count < sub.length() || (count == 0)) {
			return -1;
		}	
		return i - count;
	}
}
