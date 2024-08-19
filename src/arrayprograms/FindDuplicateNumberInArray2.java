package arrayprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicateNumberInArray2 {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 4, 5, 6, 7, 8, 9, 9, 9 };

		Set<Integer> uniqueSet = new LinkedHashSet<Integer>();

		Set<Integer> duplicateSet = new LinkedHashSet<Integer>();

		for (int num : a) {
			if (!uniqueSet.contains(num)) {
				uniqueSet.add(num);
			} else {
				duplicateSet.add(num);
			}
		}

		for (int num : duplicateSet) {
			System.out.println(num);
		}

	}

}
