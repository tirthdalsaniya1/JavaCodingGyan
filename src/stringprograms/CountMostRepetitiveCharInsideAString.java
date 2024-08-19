package stringprograms;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountMostRepetitiveCharInsideAString {

	static void countMostRepetitiveWordInAString(String inputString) {
		LinkedHashMap<String, Integer> countWordsMap = new LinkedHashMap<>();

		String[] wordsArray = inputString.split(" ");

		for (String word : wordsArray) {

			if (!countWordsMap.containsKey(word)) {
				countWordsMap.put(word, 1);
			} else {
				countWordsMap.put(word, countWordsMap.get(word) + 1);
			}
		}

		int maxValue = Integer.MIN_VALUE;
		String wordWithMaxOccurance = null;
		for (Map.Entry<String, Integer> entries : countWordsMap.entrySet()) {
			if (entries.getValue() > maxValue) {
				maxValue = entries.getValue();
				wordWithMaxOccurance = entries.getKey();
			}

		}

		System.out.println("Occurance of " + wordWithMaxOccurance + " is " + maxValue);
	}

	public static void main(String[] args) {
		countMostRepetitiveWordInAString("java is java java is");
		countMostRepetitiveWordInAString("hi hello how r you hi hi hi r");

	}
}
