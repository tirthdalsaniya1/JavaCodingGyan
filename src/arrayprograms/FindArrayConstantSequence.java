package arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class FindArrayConstantSequence {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 3, 3, 4, 4 };
		// Output: [1, 1], [3, 3, 3], [4, 4]

		/*
		 * you need to create an separate array of elements which atleast comes more
		 * than 1 time in the sequence
		 */

		ArrayList<List<Integer>> finalList = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();

		list.add(a[0]); // Start with the first element

		for (int i = 1; i < a.length; i++) {
			if (a[i] == a[i - 1]) {
				// If current element is equal to the previous, it's part of the constant
				// subsequence
				list.add(a[i]);
			} else {
				// When the sequence breaks, add the current subsequence to finalList if it has
				// more than 1 element
				if (list.size() > 1) {
					finalList.add(new ArrayList<>(list));
				}
				// Reset the list to start a new subsequence
				list.clear();
				list.add(a[i]);
			}
		}

		// Add the last subsequence if it has more than 1 element
		if (list.size() > 1) {
			finalList.add(new ArrayList<>(list));
		}

		// Print the final list of constant subsequences
		System.out.println(finalList);
	}

}
