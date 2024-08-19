package arrayprograms;

public class VerifyArrayContainValue {

	public static void main(String[] args) {
		// Java: Test if an array contains a specific value
// https://www.w3resource.com/java-exercises/array/java-array-exercise-5.php
		int[] my_array = { 1789, 2035, 1899, 1456, 2013 };

		// Check if the integer array 'my_array' contains the item 2013 and print the
		// result.
		System.out.println(contains(my_array, 2013));

		// Check if the integer array 'my_array' contains the item 2015 and print the
		// result.
		System.out.println(contains(my_array, 2015));
	}

	public static boolean contains(int[] arr, int i) {
		for (int n : arr) {
			if (n == i) {
				return true;
			}
		}
		return false;
	}
}
