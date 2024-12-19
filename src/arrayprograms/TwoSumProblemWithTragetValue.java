package arrayprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoSumProblemWithTragetValue {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int target = 10;
		List<int[]> list = returnIndexesOfGivenSum(a, target);

		for (int[] pair : list) {
			System.out.println(Arrays.toString(pair));
		}
	}

	public static List<int[]> returnIndexesOfGivenSum(int[] a, int target) {

		ArrayList<int[]> pairs = new ArrayList<>();
		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] + a[j] == target) {
					pairs.add(new int[] { i, j });

				}
			}
		}
		return pairs;
	}

}
