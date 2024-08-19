package arrayprogramstpoint;

import java.util.Arrays;
import java.util.HashSet;

public class CheckEqualityOfTwoArray {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 0, 2, 3, 4, 1, 7, 6 };
		int[] arr1 = { 1, 0, 0, 2, 3, 4, 1, 7, 6 };

		boolean isEqual = Arrays.equals(arr, arr1);

		if (isEqual == true) {
			System.out.println("both are equal");
		} else {
			System.out.println("not equal");

		}

	}

}
