package stringprograms;

import java.util.HashMap;
import java.util.Map;

public class PrintStringInAgivenWay {

	public static void main(String[] args) {
		String s = "aaabbc";
		char[] c = s.toCharArray();
		HashMap<Character, Integer> countMap = new HashMap<>();

		for (char d : c) {

			if (!countMap.containsKey(d)) {
				countMap.put(d, 1);
			} else {
				countMap.put(d, countMap.get(d) + 1);
			}
		}
		StringBuilder str = new StringBuilder();
		for (Map.Entry<Character, Integer> entries : countMap.entrySet()) {

			char key = entries.getKey();
			int value = entries.getValue();
			System.out.println(key);
			System.out.println(value);

			str.append(key);
			str.append(value);

		}
		System.out.println(str);
	}
}
