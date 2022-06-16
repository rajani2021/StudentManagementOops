package nal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapComparison {

	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");		
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");		
		
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");	
		//key - value, equals method		
		System.out.println(map1.equals(map2));
		System.out.println(map1.equals(map3));
		System.out.println("*************************************");
		//keyset use
		System.out.println(map1.keySet().equals(map2.keySet()));
		System.out.println(map1.keySet().equals(map3.keySet()));
		//combinedkeys
		System.out.println("*************************************");
		HashSet<Integer> combinedKeys = new HashSet<Integer>(map1.keySet());
		combinedKeys.addAll(map4.keySet());
		combinedKeys.removeAll(map1.keySet());
		System.out.println(combinedKeys);
		
		//comparison based on Values
		System.out.println("*************************************");
		HashMap<Integer, String> map41 = new HashMap<Integer, String>();
		map41.put(1, "A");
		map41.put(2, "B");
		map41.put(3, "C");
		
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(4, "A");
		map5.put(5, "B");
		map5.put(6, "C");
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(1, "A");
		map6.put(2, "B");
		map6.put(3, "C");
		map6.put(4, "C");		
				
		//Duplicates are not allowed
		
		System.out.println(new ArrayList<>(map41.values()).equals(new ArrayList<>(map5.values())));
		System.out.println(new ArrayList<>(map41.values()).equals(new ArrayList<>(map6.values())));
		
		//Duplicates are Allowed
		
		System.out.println(new HashSet<>(map41.values()).equals(new HashSet<>(map5.values())));
		System.out.println(new HashSet<>(map41.values()).equals(new HashSet<>(map6.values())));
	}
}