package arrayprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairSumFinder {

	public static Set<List<Integer>> findPairsWithSum(int[] arr, int targetSum) {
		Set<List<Integer>> result = new HashSet<>();
		Set<Integer> seen = new HashSet<>();

		for (int num : arr) {
			int complement = targetSum - num;
			// Check if the complement has been seen before
			if (seen.contains(complement)) {
				// Sort the pair to maintain order (e.g., {1,4} instead of {4,1})
				List<Integer> pair = Arrays.asList(Math.min(num, complement), Math.max(num, complement));
				result.add(pair);
			}
			// Add the current number to the seen set
			seen.add(num);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int targetSum = 5;
		Set<List<Integer>> pairs = findPairsWithSum(arr, targetSum);

		System.out.println("Pairs with sum " + targetSum + ":");
		for (List<Integer> pair : pairs) {
			System.out.println(pair);
		}
	}
}