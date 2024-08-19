package arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoIntegerArray {

	// Java Program to find common elements in two Arrays

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 4 };

		int[] arr2 = { 1, 2, 4 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == arr2[j]) {
					set.add(arr1[i]);
					break;
				}

			}
		}

		System.out.println(set);

	}
}