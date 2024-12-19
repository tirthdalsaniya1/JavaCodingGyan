package arrayprograms;

public class LeetCodeTwoSumArray2 {

	public static void main(String[] args) {

		int[] nums = { 0, 2, 10, 7, 11, 15 };
		int target = 9;

		for (int i = 0; i < nums.length; i++) {

			for (int j = i + 1; j < nums.length; j++) {
				int givenNum = nums[i];

				if (nums[j] + givenNum == target) {
					System.out.println("index of first no " + i);
					System.out.println("index of second no " + j);
					break;

				}
			}

		}

	}

}
