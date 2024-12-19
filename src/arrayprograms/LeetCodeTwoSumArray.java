package arrayprograms;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCodeTwoSumArray {

	public static void main(String[] args) {
		// LeetCodeTwoSum problem
		int[] nums = { 0, 2, 10, 7, 11, 15 };
		int target = 9;
		int[] a = twoSum(nums, target);

		System.out.println(Arrays.toString(a));

	}

	public static int[] twoSum(int[] nums, int target) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);

		}

		for (int i = 0; i < nums.length; i++) {

			int index1 = i;

			int remainingNum = target - nums[i];

			if (map.containsKey(remainingNum)) {

				int index2 = map.get(remainingNum);

				// Ensure the indices are distinct
				if (index2 != index1) {
					return new int[] { index1, index2 };
				}

			}

		}
		return null;

	}

}
