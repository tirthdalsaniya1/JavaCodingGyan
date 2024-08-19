package arrayprogramstpoint;

import java.util.ArrayList;

public class GivenArrayIsPalindromeOrNot {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1 };

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = a.length - 1; i >= 0; i--) {

			list.add(a[i]);

		}
		// Check if the original array is equal to the ArrayList or not
		boolean isEqual = true;

		for (int i = 0; i < a.length; i++) {
			if (a[i] != list.get(i)) {
				isEqual = false;
			
				// No need to check further once a mismatch is found
				break;
			}
		}

		// Print the result
		if (isEqual == true) {
			System.out.println("its palindrome");
		} else {
			System.out.println("not palindrome");

		}

	}

}