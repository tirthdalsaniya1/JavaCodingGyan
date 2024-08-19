package stringprograms;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountMostRepetitiveWordInAString {

	static void countMostRepetitiveWordInAString(String inputString) {
		LinkedHashMap<Character, Integer> countCharMap = new LinkedHashMap<>();

		char[] charArray = inputString.toCharArray();

		for (char givenChar : charArray) {
			if (givenChar != ' ') {
				if (!countCharMap.containsKey(givenChar)) {
					countCharMap.put(givenChar, 1);
				} else {
					countCharMap.put(givenChar, countCharMap.get(givenChar) + 1);
				}
		}}

		int maxValue = Integer.MIN_VALUE;
		char charWithMaxOccurance = 0;
		for (Map.Entry<Character, Integer> entries : countCharMap.entrySet()) {
			if (entries.getValue() > maxValue) {
				maxValue = entries.getValue();
				charWithMaxOccurance = entries.getKey();
			}

		}

		System.out.println("Occurance of " + charWithMaxOccurance + " is " + maxValue);
	}

	public static void main(String[] args) {
		countMostRepetitiveWordInAString("java                  tttttttttt");
		countMostRepetitiveWordInAString("hello                           ");

	}
}