package arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class DecreasingSubsequences {

	public static void main(String[] args) {
		int[] a = { 9, 7, 5, 3, 4, 4, 2, 1, 6, 4, 3, 3 }; // Input array
		// Output: [9, 7, 5, 3], [4], [4, 2, 1], [6, 4, 3], [3]

		ArrayList<List<Integer>> finalList = new ArrayList<>();

		ArrayList<Integer> list = new ArrayList<>();

		list.add(a[0]);

		for (int i = 1; i < a.length; i++) {

			if (a[i] < a[i - 1]) {

				list.add(a[i]);
			} else {

				/*
				 * if element break the decreasing seq then add list into finalList and reset
				 * list
				 */

				finalList.add(new ArrayList<>(list));

				list.clear();

				list.add(a[i]);
			}

		}
		finalList.add(list);

		System.out.println(finalList);

	}

}