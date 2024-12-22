package javaconcept2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteratorExample {

	public static void main(String[] args) {
		// Create a HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Alice", 30);
		map.put("Bob", 25);
		map.put("Charlie", 35);

		// Get the entry set from the HashMap

		Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {

			Map.Entry<String, Integer> it = iterator.next();
			//Get the key and value
			System.out.println("key is " + it.getKey() + " value is " + it.getValue());
		}
	}

}
