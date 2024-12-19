package arrayprograms;

import java.util.ArrayList;
import java.util.List;

public class ArrayIncreasingDecreasingSeqProgram {

	public static List<List<Integer>> getIncreasingSubsequences(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> currentSubsequence = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			// Start a new subsequence if the current element is smaller than the last in
			// the current subsequence
			if (!currentSubsequence.isEmpty() && arr[i] < currentSubsequence.get(currentSubsequence.size() - 1)) {
				result.add(new ArrayList<>(currentSubsequence));
				currentSubsequence.clear();
			}
			// Add the current element to the current subsequence
			currentSubsequence.add(arr[i]);
		}

		// Add the last subsequence if it has elements
		if (!currentSubsequence.isEmpty()) {
			result.add(currentSubsequence);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 4, 2, 1 };
		List<List<Integer>> subsequences = getIncreasingSubsequences(arr);

		System.out.println("Increasing Subsequences:");
		for (List<Integer> subsequence : subsequences) {
			System.out.println(subsequence);
		}
	}

}