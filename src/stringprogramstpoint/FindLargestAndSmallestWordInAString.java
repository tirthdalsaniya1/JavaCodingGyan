package stringprogramstpoint;

public class FindLargestAndSmallestWordInAString {

	public static void main(String[] args) {
		String string = "Hardships often prepare ordinary people for an extraordinary destiny";

		String[] words = string.split(" ");

		int largestLength = Integer.MIN_VALUE;
		int smallestLength = Integer.MAX_VALUE;
		String smallestString = "";
		String largestString = "";

		for (String str : words) {

			if (str.length() > largestLength) {
				largestLength = str.length();
				largestString = str;

			}

			else if (str.length() < smallestLength) {
				smallestLength = str.length();
				smallestString = str;
			}
		}
		System.out.println("smallest string is " + smallestString + " with length " + smallestLength);
		System.out.println("largest string is " + largestString + " with length " + largestLength);

	}

}