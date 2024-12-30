package mapprograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortMapByKeys {

	public static void main(String[] args) {
		// WAP to sort a Map by its values
		//Note: this will not work incase there is any null key or value
		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 9);
		map.put(2, 2);
		map.put(3, 3);
		map.put(4, 6);
		map.put(0, 7);
		map.put(6, 0);

		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

		list.sort(Map.Entry.comparingByValue());

		Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

		for (Map.Entry<Integer, Integer> entries : list) {
			int key = entries.getKey();
			int value = entries.getValue();

			sortedMap.put(key, value);
		}

		System.out.println(sortedMap);

	}

}