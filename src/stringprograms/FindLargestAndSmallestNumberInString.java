package stringprograms;

public class FindLargestAndSmallestNumberInString {

	public static void main(String[] args) {

		// Find Largest And Smallest Number In String

		String input = "1234567890abc";
		char max = Character.MIN_VALUE;
		char min = Character.MAX_VALUE;

		for (char k : input.toCharArray()) {

			if (k > max && Character.isDigit(k)) {
				max = k;
			}

			if (k < min && Character.isDigit(k)) {
				min = k;
			}
		}
		System.out.println("max number is " + max);
		System.out.println("min number is " + min);

	}
}
