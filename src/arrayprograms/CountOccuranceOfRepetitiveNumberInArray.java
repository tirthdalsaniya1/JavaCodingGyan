package arrayprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccuranceOfRepetitiveNumberInArray {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 4, 5, 6, 7, 8, 9, 9 };

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int num : a) {
			if (!map.containsKey(num)) {

				map.put(num, 1);
			}

			else {
				map.put(num, (map.get(num)) + 1);

			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {
				System.out.println("for element " + entry.getKey() + " occurance is " + entry.getValue());

			}

		}

	}

}