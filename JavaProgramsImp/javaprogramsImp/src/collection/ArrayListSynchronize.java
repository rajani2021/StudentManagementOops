package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListSynchronize {

	public static void main(String[] args) {
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			while(it.hasNext()) {
				System.out.println(it.next());
			}
		}
	
	}

}
