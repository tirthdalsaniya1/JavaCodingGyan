package arrayprogramstpoint;

import java.util.HashSet;

public class RemoveDuplicateNumberFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 0, 2, 3, 4, 1, 7, 6 };

		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {

			set.add(i);

		}
		for (int i : set) {
			System.out.print(i + " ");
		}

	}

}
