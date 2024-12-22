package arrayprograms;

import java.util.HashSet;

public class CommonElementsBetweenMultipleIntArray {

	public static void main(String[] args) {
		// Find common between this all array

		int[] arr = { 1, 2, 3, 6, 7, 8 };
		int[] arr1 = { 1, 2, 4, 5 };
		int[] arr2 = { 1, 2, 5, 6, 7 };
		int[] arr3 = { 1, 2, 5, 6 };
		findCommonBetweenArray(arr, arr1, arr2, arr3);
	}

	static void findCommonBetweenArray(int[]... a) {

		HashSet<Integer> commonSet = new HashSet<>();

		// Initially add 1st array in the common set

		for (int i : a[0]) {
			commonSet.add(i);
		}
		System.out.println("initial common set is " + commonSet);

		// create another set and now add remaining all array in the same set
		for (int i = 1; i < a.length; i++) {
			HashSet<Integer> set = new HashSet<>();
			for (int n : a[i]) {
				set.add(n);
			}
			/*
			 * retainAll method is used to keep only the elements that are common between
			 * the commonSet and the current set. This operation effectively finds the
			 * intersection of the two sets.
			 */

			commonSet.retainAll(set);

		}
		System.out.println("final common set is " + commonSet);
	}

}