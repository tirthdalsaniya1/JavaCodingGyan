package arrayprogramstpoint;

import java.util.HashMap;
import java.util.Map;

public class FindFrequencyOfEachWordInAStringArray {

	public static void main(String[] args) {
		String[] str = { "Hello world", "Hello Java", "Java is great", "Java is powerful" };

		HashMap<String, Integer> map = new HashMap<>();

		for (String s : str) {

			String[] string = s.split(" ");
			for (String str1 : string) {

				if (!map.containsKey(str1)) {
					map.put(str1, 1);
				} else {
					map.put(str1, map.get(str1) + 1);
				}
			}

		}
		for (Map.Entry<String, Integer> entries : map.entrySet()) {

			System.out.println("word is " + entries.getKey() + " occurance is " + entries.getValue());

		}

	}

}
