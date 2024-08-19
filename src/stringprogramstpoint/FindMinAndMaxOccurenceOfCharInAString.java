package stringprogramstpoint;

import java.util.HashMap;
import java.util.Map;

public class FindMinAndMaxOccurenceOfCharInAString {

	public static void main(String[] args) {
		String s = "grass is greener on the other side";

		HashMap<Character, Integer> map = new HashMap<>();

		// String[] string = s.split(" ");
		char[] chars = s.toCharArray();

		for (char c : chars) {

			if (c != ' ') {
				if (!map.containsKey(c)) {
					map.put(c, 1);
				} else {
					map.put(c, map.get(c) + 1);
				}

			}

		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		char charWithMinOccurance = ' ';
		char charWithMaxOccurance = ' ';
		for (Map.Entry<Character, Integer> entries : map.entrySet()) {

			// System.out.println(" occurance of " + entries.getKey() + " is " +
			// entries.getValue());

			if (entries.getValue() > max) {
				max = entries.getValue();

			}
			if (entries.getValue() < min) {
				min = entries.getValue();

			}
		}

		for (Map.Entry<Character, Integer> entries : map.entrySet()) {
			if ((entries.getValue()).equals(max)) {
				System.out.println("max occurance = " + entries.getKey() + " is " + entries.getValue() + " times");
			}
			if ((entries.getValue()).equals(min)) {
				System.out.println("min occurance = " + entries.getKey() + " is " + entries.getValue() + " times");
			}
		}

	}

}
