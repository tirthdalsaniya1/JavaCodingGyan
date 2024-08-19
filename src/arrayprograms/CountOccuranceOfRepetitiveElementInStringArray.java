package arrayprograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccuranceOfRepetitiveElementInStringArray {

	public static void main(String[] args) {

		String[] a = { "bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu" };

		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

		for (String k : a) {

			if (!map.containsKey(k)) {
				map.put(k, 1);
			} else {
				map.put(k, map.get(k) + 1);
			}

		}
		
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1)
			System.out.println("key is "+entry.getKey()+" "+ " value is "+ entry.getValue());
		}

	}

}
