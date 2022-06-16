package nal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class AlIteration {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		System.out.println("AL sie is : "+al.size());
		al.add("ABC");
		al.add("XYZ");
		System.out.println("AL sie is : "+al.size());
		
		//Simple For loop
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		} 
		
		System.out.println("****************foreach********************");
		//foreach
		
		for (String s : al) {
			System.out.println(s);
		}
		
		System.out.println("*****************lamda******************");
		
		//stream with lamda 
		
		al.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("****************Iterator*****************");
		//Iterator
		
		Iterator<String> it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Creating ArrayList, with the help of another ArrayList
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(23,13,21,31,13));
		System.out.println("numbers : "+numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("qwert", "asdf", "zxcvbnm"));
		System.out.println("names : "+names);
		System.out.println("names AL size : "+names.size());
	}

}
