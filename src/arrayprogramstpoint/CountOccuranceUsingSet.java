package arrayprogramstpoint;

import java.util.HashSet;

public class CountOccuranceUsingSet {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 1, 9, 9 };

		HashSet<Integer> uniqueElements = new HashSet<>();

		for (int num : arr) {

			uniqueElements.add(num);

		}

		for (int uniqueElement : uniqueElements) {
			int count = 0;
			for (int aElement : arr) {

				if (aElement == uniqueElement) {

					count++;
				}
			}
			System.out.println(uniqueElement + " occures  " + count);
		}
	}

}
