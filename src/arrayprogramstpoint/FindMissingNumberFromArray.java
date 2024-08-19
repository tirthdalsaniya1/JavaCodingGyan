package arrayprogramstpoint;

import java.util.HashSet;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 7, 6};

		// first remove duplicates from an array
		HashSet<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);
		}

		// print new array and find sum of elements
		int sum_without_missing = 0;
		for (int i : set) {
			System.out.print(i + " ");
			sum_without_missing = sum_without_missing + i;
		}
		System.out.println();

		// sum of element
		System.out.println("Sum without missing element is " + sum_without_missing);

		/*
		 * now as you know the range of all element inside the set so iterate using
		 * forloop in that range and take sum of all element
		 */
		int sum_with_missing = 0;
		for (int i = 1; i <= 7; i++) {
			sum_with_missing = sum_with_missing + i;
		}
		System.out.println("Sum with missing element is " + sum_with_missing);

		// now substract sum without missing from sum with missing element
		System.out.println("missing element is " + (sum_with_missing - sum_without_missing));
	}

}