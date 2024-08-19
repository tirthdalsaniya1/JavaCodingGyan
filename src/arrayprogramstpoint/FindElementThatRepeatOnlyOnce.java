package arrayprogramstpoint;

import java.util.HashMap;
import java.util.Map;

public class FindElementThatRepeatOnlyOnce {

	public static void main(String[] args) {
		/*
		 * We need to find the element that repeat only once.
		 * 
		 * Input 1: { 0, 2, 3, 5, 4, 5, 3, 4 } 
		 * Output: [3,4,5]
		 */

		int[] a = { 0, 2, 3, 5, 4, 5, 3, 4 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i : a) {

			if (!map.containsKey(i)) {
				map.put(i, 1);
			} else {
				map.put(i, map.get(i) + 1);
			}
		}

		for (Map.Entry<Integer, Integer> entries : map.entrySet()) {

			if (entries.getValue() == 2) {
				System.out.println("key is " + entries.getKey() + " and value is " + entries.getValue());
			}

		}

	}

}
