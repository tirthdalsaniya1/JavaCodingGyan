package arrayprogramstpoint;

import java.util.HashMap;
import java.util.Map;

public class FindElementThatRepeatMaxInArray {

	public static void main(String[] args) {
		/*
		 * We need to find the element that repeat Max. For that we need to find
		 * frequency of each element
		 * 
		 * 
		 */

		int[] a = { 0, 2, 3, 5, 4, 5, 3, 4, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : a) {

			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}

		int maxFreq = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> entries : map.entrySet()) {

			if (entries.getValue() > 1) {
				System.out.println("key is " + entries.getKey() + " and value is " + entries.getValue());
				if (entries.getValue() > maxFreq) {
					maxFreq = (entries.getValue());

				}
			}

		}
		System.out.println("Max freq=" + maxFreq);

	}

}
