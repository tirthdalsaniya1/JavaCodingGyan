package arrayprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PairSumFinderEasySolution {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 2, 4, 2, 1 };
		int sumNum = 4;

		HashSet<List<Integer>> set = new HashSet<>();
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				// System.out.print(a[j]);
				int sum = a[i] + a[j];
				if (sum == sumNum) {
					List<Integer> list = new ArrayList<>();

					list.add(a[i]);
					list.add(a[j]);
					// if we will not sort then it will store similar kind of pairs like [1,2] and
					// [2,1]
					list.sort(null);

					set.add(list);
				}

			}
			// System.out.println();

		}

		System.out.println(set);
	}
}