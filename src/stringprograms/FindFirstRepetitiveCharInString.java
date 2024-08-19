package stringprograms;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstRepetitiveCharInString {

	private static void findFirstRepetitiveCharInString(String inputString) {

		LinkedHashMap<Character, Integer> countCharMap = new LinkedHashMap<>();
		char[] charArray = inputString.toCharArray();
		for (char c : charArray) {
			if (c != ' ') {

				if (!countCharMap.containsKey(c)) {
					countCharMap.put(c, 1);
				} else {
					countCharMap.put(c, (countCharMap.get(c)) + 1);
				}

			}
		}
		char firstRepetitiveChar = 0;
		int maxOccuranceOfFirstRepetitiveChar = Integer.MIN_VALUE;

		for (Map.Entry<Character, Integer> entries : countCharMap.entrySet()) {
			if (entries.getValue() > maxOccuranceOfFirstRepetitiveChar) {
				maxOccuranceOfFirstRepetitiveChar= entries.getValue();
				firstRepetitiveChar = entries.getKey();
				if(entries.getValue()>1) {
					break;
				}
			}
		}
		System.out.println(firstRepetitiveChar +"'s occurance is "+ maxOccuranceOfFirstRepetitiveChar);
	}

	public static void main(String[] args) {
		findFirstRepetitiveCharInString("jbavaisava bava");
	}
}
