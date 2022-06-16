package nal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HaskhMap {

	public static void main(String[] args) {
		HashMap<String, String> capitalMap = new HashMap<String, String>();
		capitalMap.put("India", "Dlhi");
		capitalMap.put("USA", "W DC");
		capitalMap.put("UK", "London");
		capitalMap.put("UK", "London11");
		capitalMap.put(null, "Berlin");
		capitalMap.put(null, "LA");		
		capitalMap.put("Russia", null);
		capitalMap.put("France", null);
		capitalMap.remove("France");
		/*
		 * System.out.println("HashMap = "+capitalMap);
		 * System.out.println(capitalMap.get("USA"));
		 * System.out.println(capitalMap.get(null));
		 * System.out.println(capitalMap.get("France"));
		 */
		
		//Iterator using keySet
		Iterator<String> it = capitalMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			String value = capitalMap.get(key);
			System.out.println("key = "+key+"\t"+"value = "+value);
		}
		
		System.out.println("*********************************************");
		
		//Iteration using EntrySet
		Iterator<Entry<String, String>> it1 = capitalMap.entrySet().iterator();
		while(it1.hasNext()) {
			Entry<String, String> entry = it1.next();
			System.out.println("key = "+entry.getKey()+"\t"+"value = "+entry.getValue());
		}
		
		System.out.println("*************************************");
		//Iterate Hashmap using Lambda expression
		capitalMap.forEach((k,v) -> System.out.println("key = "+k+"\t"+"value = "+v));
	}

}
