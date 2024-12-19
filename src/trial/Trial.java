package trial;

import java.util.ArrayList;
import java.util.List;

public class Trial {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 2, 4, 2, 1, 0, 1, 9, 8 };

		ArrayList<List<Integer>> finalList = new ArrayList<>();

		ArrayList<Integer> tempList = new ArrayList<>();
		tempList.add(a[0]); // Start with the first element

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				// Continue increasing sequence
				tempList.add(a[i]);
			} else {
				// Add current increasing sequence to finalList
				finalList.add(new ArrayList<>(tempList));
				tempList.clear();
				tempList.add(a[i]); // Start a new sequence
			}
		}

		// Add the last collected sequence
		finalList.add(new ArrayList<>(tempList));

		System.out.println(finalList);
	}
}