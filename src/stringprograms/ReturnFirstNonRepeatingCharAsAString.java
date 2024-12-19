package stringprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnFirstNonRepeatingCharAsAString {

	public static void main(String[] args) {
		String s = "abbcdee";
		String result = firstNonRepeatingString(s);
		System.out.println(result);
	}

	static String firstNonRepeatingString(String s) {

		Map<Character, Integer> countMap = new LinkedHashMap<>();

		for (char c : s.toCharArray()) {

			if (!countMap.containsKey(c)) {
				countMap.put(c, 1);
			} else {
				countMap.put(c, countMap.get(c) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
			Character key = entry.getKey();
			String nonRepeatingChar = String.valueOf(key);
			Integer value = entry.getValue();

			if (value == 1) {
				return nonRepeatingChar;
			}
		}

		return null;
	}

}
