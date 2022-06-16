package nal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("Python");
		al.add("php");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Testing");
		al2.add("DevOps");
		// al.addAll(al2);
		// System.out.println("al + al2 = "+al);
		al.addAll(1, al2);// Inserts from mentioned Index
		System.out.println("Based on Index = " + al);
		// al.clear();
		// System.out.println("clear = "+al);//clears the list
		ArrayList<String> cloneAl = (ArrayList<String>) al2.clone();

		System.out.println("Cloned Al : " + cloneAl);// cloned Al
		System.out.println("Contains = " + al2.contains("Testing"));
		System.out.println(al2.indexOf("Testing") > 0);
		ArrayList<String> list1 = new ArrayList<String>(Arrays.asList("abscd", "qwrrtt", "bggesw", "werwwtw"));
		System.out.println("List1 = " + list1);
		int li = list1.lastIndexOf("qwrrtt");
		System.out.println("last index = " + li);
		System.out.println("Remove = " + al.remove(2));
		System.out.println(al);
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1));
		// numbers.removeIf(num -> num%2 == 0);
		// numbers.removeIf(num -> num%2 == 1);
		System.out.println(numbers);
		numbers.retainAll(Collections.singleton(1));
		System.out.println(numbers);
		ArrayList<Integer> numbers2 = new ArrayList<Integer>(
				Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 3, 4, 5, 6, 7, 8, 9, 1));
		ArrayList<Integer> numSublist = new ArrayList<Integer>(numbers2.subList(6, 12));
		System.out.println(numSublist);
		// Converting ArrayList to array
		ArrayList<String> convertToArray = new ArrayList<String>(Arrays.asList("name1", "name2", "name2", "name5"));
		System.out.println("ConvertToArray : " + convertToArray);
		Object[] arr = convertToArray.toArray();
		System.out.println("Array Values are : " + Arrays.toString(arr));
		for (Object object : arr) {
			System.out.println((String) object);
		}
	}
}