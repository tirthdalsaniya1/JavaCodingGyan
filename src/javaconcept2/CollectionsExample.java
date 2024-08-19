package javaconcept2;

import java.util.*;

public class CollectionsExample {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(2);
		numbers.add(8);
		numbers.add(1);

		// Sort the list
		Collections.sort(numbers);
		System.out.println("Sorted List: " + numbers);

		// Reverse the list
		Collections.reverse(numbers);
		System.out.println("Reversed List: " + numbers);

		// Shuffle the list
		Collections.shuffle(numbers);;;;;
		System.out.println("Shuffled List: " + numbers);

		// Find the maximum and minimum elements
		Integer max = Collections.max(numbers);
		Integer min = Collections.min(numbers);
		System.out.println("Maximum Element: " + max);
		System.out.println("Minimum Element: " + min);

		// Create an unmodifiable view of the list
		List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
		System.out.println("Unmodifiable List: " + unmodifiableList.add(min));

		// Create a synchronized (thread-safe) list
		List<Integer> synchronizedList = Collections.synchronizedList(numbers);
		System.out.println("Synchronized List: " + synchronizedList);
	}
}