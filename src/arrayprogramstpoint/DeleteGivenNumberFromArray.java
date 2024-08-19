package arrayprogramstpoint;

import java.util.HashSet;

public class DeleteGivenNumberFromArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 1, 7, 6 };

		int num = 7;

		HashSet<Integer> set = new HashSet<>();
		for (int i : arr) {
			if (i != num) {
				set.add(i);
			}
		}
		for (int i : set) {
			System.out.print(i+" ");
		}

	}

}
