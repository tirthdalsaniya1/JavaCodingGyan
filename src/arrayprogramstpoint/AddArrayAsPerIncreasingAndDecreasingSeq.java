package arrayprogramstpoint;

import java.util.ArrayList;

public class AddArrayAsPerIncreasingAndDecreasingSeq {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 1, 5, 1, 2, 1, 9, 9, 9 };
		// O/P [1, 2, 3], [1], [1, 5], [1, 2], [1, 9], [9], [9]

		ArrayList<ArrayList<Integer>> finalList = new ArrayList<>();
		ArrayList<Integer> list = new ArrayList<>();

		list.add(a[0]);

		for (int i = 1; i < a.length; i++) {
			if (a[i] > a[i - 1]) {
				// add increasing element in the list
				list.add(a[i]);
			} else {
				/*
				 * first of all add previous list inside final list and then clear the list
				 * object and start adding decreasing element inside the list
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
