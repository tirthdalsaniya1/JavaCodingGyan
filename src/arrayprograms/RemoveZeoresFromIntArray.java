package arrayprograms;

import java.util.ArrayList;

public class RemoveZeoresFromIntArray {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 0, 3, 0, 4, 0, 5, 0 };

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i : arr) {
			if (i != 0) {
				list.add(i);
			}
		}

		System.out.println(list);
	}

}
