package stringprograms;

import java.util.ArrayList;

public class PalindromeSmallestAndLargest {

	public static void main(String[] args) {

		String str = "ABAD SSSS AAA PQP aa";

		ArrayList<String> list = new ArrayList<>();

		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			String rev = "";
			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				rev = rev + strArr[i].charAt(j);
			}
			if (rev.equals(strArr[i])) {
				list.add(strArr[i]);
			}

		}
		System.out.println(list);
		String smallest = "";
		String largest = "";
		int smallestLength = Integer.MAX_VALUE;
		int largestLength = Integer.MIN_VALUE;

		for (String str1 : list) {

			int length = str1.length();

			if (length > largestLength) {
				largestLength = length;
				largest = str1;
			}

			if (length < smallestLength) {
				smallestLength = length;
				smallest = str1;
			}

		}
		System.out.println(" is "+ smallest);
		System.out.println(" is "+ largest);

	}

}
