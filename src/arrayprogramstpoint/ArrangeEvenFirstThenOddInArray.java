package arrayprogramstpoint;

import java.util.ArrayList;

public class ArrangeEvenFirstThenOddInArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 == 0) {
				list.add(a[i]);
			}

		}
		for (int i = 0; i < a.length; i++) {

			if (a[i] % 2 != 0) {
				list.add(a[i]);
			}

		}
		for (int i : list) {
			System.out.println(i);
		}

	}

}
