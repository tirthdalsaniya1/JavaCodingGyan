package arrayprograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromIntegerArray {

	// Java Program to remove duplicate elements from Integer Array

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 3, 4 };

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			set.add(arr1[i]);
		}

		System.out.println(set);

	}
}