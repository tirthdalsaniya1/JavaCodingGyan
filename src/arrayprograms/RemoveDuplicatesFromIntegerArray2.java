package arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromIntegerArray2 {

	// Java Program to remove duplicate elements from Integer Array

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 4 };

		List<Integer> list = new ArrayList<>();

		for (int k : arr1) {

			if (!list.contains(k)) {
				list.add(k);
			}
		}

		System.out.println(list);

	}
}