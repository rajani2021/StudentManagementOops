package javaPrograms;

import java.util.Arrays;
import java.util.BitSet;

public class PrintNumberWithoutNumberLoop {

	public static void main(String[] args) {
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count =0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.deepToString(num));
		
		System.out.println("===========================================");
		
		//2.Bitset
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set,1,set.length());
	}

}
