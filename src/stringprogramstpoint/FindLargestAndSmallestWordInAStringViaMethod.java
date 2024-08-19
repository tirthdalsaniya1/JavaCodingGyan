package stringprogramstpoint;

import java.util.HashMap;
import java.util.Map;

public class FindLargestAndSmallestWordInAStringViaMethod {

	public static void main(String[] args) {
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";
		Map<String, Object> map = findLargestAndSmallestWordInAString(string);
		System.out.println(
				"smallest word is " + map.get("smallestString") + " with length= " + map.get("smallestLength"));
		System.out.println("largest word is " + map.get("largestString") + " with length= " + map.get("largestLength"));

	}

	static Map<String, Object> findLargestAndSmallestWordInAString(String s) {
		String[] words = s.split(" ");

		int largestLength = Integer.MIN_VALUE;
		int smallestLength = Integer.MAX_VALUE;
		String smallestString = "";
		String largestString = "";

		for (String str : words) {

			if (str.length() > largestLength) {
				largestLength = str.length();
				largestString = str;
			}

			else if (str.length() < smallestLength) {
				smallestLength = str.length();
				smallestString = str;
			}
		}
		Map<String, Object> map = new HashMap<>();
		map.put("largestString", largestString);
		map.put("smallestString", smallestString);
		map.put("largestLength", largestLength);
		map.put("smallestLength", smallestLength);

		return map;
	}

}