package nal;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(100);
		al.add(200);
		al.add("Testing");
		al.add(true);
		al.add(6.37);
		al.add('t');
		System.out.println("ArrayList is : "+al);
		System.out.println("Get based on Index : "+al.get(2));
		System.out.println("Size = "+al.size());
		System.out.println("Lower Index = "+ al.get(0));
		System.out.println("Higher Index = "+ al.get(al.size() - 1));
	}
}