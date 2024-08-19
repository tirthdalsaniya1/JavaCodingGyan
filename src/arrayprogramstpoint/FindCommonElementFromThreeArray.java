package arrayprogramstpoint;

import java.util.HashSet;

public class FindCommonElementFromThreeArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 5, 6 };
		int[] arr3 = { 7, 5, 4, 2, 3, 7 };

		HashSet<Integer> set1 = new HashSet<Integer>();
		for (int i : arr1) {
			set1.add(i);
		}
		HashSet<Integer> set2 = new HashSet<Integer>();

		for (int i : arr2) {
			if (set1.contains(i)) {
				set2.add(i);
			}
		}
		HashSet<Integer> commonset = new HashSet<Integer>();

		for (int i : arr3) {
			if (set2.contains(i)) {
				commonset.add(i);
			}
		}
		for (int i : commonset) {
			System.out.println(i);
		}

	}

}