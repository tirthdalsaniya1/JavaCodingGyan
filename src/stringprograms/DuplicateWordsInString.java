package stringprograms;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {
	static void duplicateWords(String inputString) {
	    // Splitting inputString into words
	    String[] words = inputString.toLowerCase().split(" ");

	    // Creating HashMap with words as key and their count as value
	    HashMap<String, Integer> wordCount = new HashMap<>();

	    // Checking each word
	    for (String word : words) {
	        // Whether it is present in wordCount
	        if (wordCount.containsKey(word)) {
	            // If present, incrementing its count by 1
	            wordCount.put(word, wordCount.get(word) + 1);
	        } else {
	            // If not present, put that word into wordCount with 1 as its value
	            wordCount.put(word, 1);
	        }
	    }

	    boolean foundDuplicates = false;

	    // Iterating through all words in wordCount
	    for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
	        // If word count is greater than 1
	        if (entry.getValue() > 1) {
	            // Printing that word and its count
	            System.out.println("Given are duplicate words inside string >> " + inputString + " >> " + entry.getKey() + " : " + entry.getValue());
	            foundDuplicates = true;
	        }
	    }

	    if (!foundDuplicates) {
	        System.out.println("No duplicate words found in the given string: " + inputString);
	    }
	}
	 public static void main(String[] args) {
	        duplicateWords("Bread butter and bread");
	        duplicateWords("Java is java again java");
	        duplicateWords("Super Man Bat Man Spider Man");
	        duplicateWords("Super Man");
	    }
}
