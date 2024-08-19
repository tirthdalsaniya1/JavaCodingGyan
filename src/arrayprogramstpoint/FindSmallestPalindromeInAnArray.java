package arrayprogramstpoint;

import java.util.ArrayList;
import java.util.Collections;

public class FindSmallestPalindromeInAnArray {

	public static void main(String[] args) {
		int[] a = { 121, 232, 123, 454, 567, 788, 999 };
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println(isPalindrome(1210));

		for (int i = 0; i < a.length; i++) {
			if (isPalindrome(a[i])) {
				list.add(a[i]);
			}
		}
		if (!list.isEmpty()) {
			System.out.println(Collections.min(list));

		}
	}

	static boolean isPalindrome(int a) {
		int rev = 0;
		int temp = a;
		while (a > 0) {

			rev = rev * 10 + a % 10; // 1 and 12
			a = a / 10;
		}
		// System.out.println(temp);
		// System.out.println(rev);
		if (temp == rev) {

			return true;
		}
		return false;

	}

}
