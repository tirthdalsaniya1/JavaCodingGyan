package arrayprograms;

import java.util.HashSet;

public class CommonElementsInTwoStringArray {

	// Java Program to find common elements in two Arrays

	public static void main(String[] args) {
		String[] arr1 = { "Article", "in", "Geeks", "for", "Geeks" };

		String[] arr2 = { "Geeks", "for", "Geeks" };

		HashSet<String> set = new HashSet<>();
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