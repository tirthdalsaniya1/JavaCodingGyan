package arrayprogramstpoint;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfEachElementInArray2 {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 1, 2, 3, 1, 2, 3, 4, 5, 6, 7, 8, 9, 9 };

		HashMap<Integer, Integer> frequencyMap = new HashMap<>();

		for (int i : arr) {
			if (!frequencyMap.containsKey(i)) {
				frequencyMap.put(i, 1);
			} else {
				frequencyMap.put(i, frequencyMap.get(i) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entries : frequencyMap.entrySet()) {
			// remove this if condition if you want to print all key and value data
			if (entries.getValue() > 1)
				System.out.println("key " + entries.getKey() + " value is " + entries.getValue());
		}
	}

}