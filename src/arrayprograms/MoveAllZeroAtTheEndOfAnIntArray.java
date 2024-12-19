package arrayprograms;

import java.util.ArrayList;

public class MoveAllZeroAtTheEndOfAnIntArray {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 3, 4, 5, 0, 0, 0 };

		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] != 0) {
				list.add(arr[i]);

			} else {
				count++;
			}
		}

		for (int i = 0; i < count; i++) {
			list.add(0);
		}
		System.out.println(list);

	}

}
