package arrayprogramstpoint;

public class FrequencyOfEachElementInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 1, 2, 1, 9,9 };
		int[] frequency = new int[arr.length];
		boolean[] visited = new boolean[arr.length]; // All elements initialized to false

		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) { // Check if arr[i] has not been visited
				int count = 1;
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] == arr[j]) {
						count++;
						visited[j] = true; // Mark arr[j] as visited
					}
				}
				frequency[i] = count; // Store the count of arr[i]
			}
		}

		// Display the frequency of each element
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) { // Only print elements that have not been marked as visited
				System.out.println("Occurrence of " + arr[i] + " is " + frequency[i]);
			}
		}

	}
}