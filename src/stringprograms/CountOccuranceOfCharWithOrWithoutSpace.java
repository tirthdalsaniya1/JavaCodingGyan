package stringprograms;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccuranceOfCharWithOrWithoutSpace {
	private static void characterCount(String inputString) {
		// Creating a HashMap containing char as a key and occurrences as a value
		LinkedHashMap<Character, Integer> charCountMap = new LinkedHashMap<>();

		// Converting given string to char array
		char[] strArray = inputString.toCharArray();

		// Checking each char of strArray
		for (char c : strArray) {
			if (c != ' ') { // Skip counting empty spaces
				if (charCountMap.containsKey(c)) {
					// If char 'c' is present in charCountMap, incrementing its count by 1
					charCountMap.put(c, charCountMap.get(c) + 1);
				} else {
					// If char 'c' is not present in charCountMap,
					// putting 'c' into charCountMap with 1 as its value
					charCountMap.put(c, 1);
				}
			}
		}

		// Printing inputString and charCountMap
		System.out.print(inputString + " : ");
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.print(entry.getKey() + "=" + entry.getValue() + ", ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		characterCount("Java");
		characterCount("All Is Well");
		characterCount("Done And Gone");
	}
}
