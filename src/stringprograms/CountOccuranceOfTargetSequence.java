package stringprograms;

public class CountOccuranceOfTargetSequence {

	public static void main(String[] args) {

		// find occurance of xx sequence in the given string
		// First xx, - 1 count
		// another xxxx - 3 here it will be 3 count
		// total 4 count

		String s = "xxsssdfgxxxx";

		String target = "xx";

		int count = 0;

		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == 'x' && s.charAt(i + 1) == 'x') {

				count++;

			}

		}

		System.out.println(count);
	}

}