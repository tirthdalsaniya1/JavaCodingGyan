package stringprograms;

public class CheckStringIsARotationOfAnotherString {
	
	public static void main(String[] args) {
		/*
		 * //Check if String is a Rotation of Another String
		 * Possible Rotations of a Given String: If a string has n characters, there are
		 * exactly n possible rotations, including the original string.
		 * 
		 * For a string "abcd", the possible rotations are:
		 * 
		 * Original string: "abcd" 1st rotation: "bcda" 2nd rotation: "cdab" 3rd
		 * rotation: "dabc"
		 * 
		 * For a string s of length n, each rotation shifts characters to the left (or
		 * equivalently to the right) by one position at a time. Empty Strings:
		 * 
		 * Input: "" and "" Output: true (an empty string is trivially a rotation of
		 * itself). Different Lengths:
		 * 
		 * Input: "abc" and "ab" Output: false (strings of different lengths cannot be
		 * rotations). Single-Character Strings:
		 * 
		 * Input: "a" and "a" Output: true (the only rotation is itself).
		 */

		String s1 = "abcd";
		String s2 = "dabc";

		if (s1.length() == s2.length() && !s1.isEmpty()) {
			String rotation = s1 + s2;
			if (rotation.contains(s2)) {
				System.out.println("its a rotation");

			} else {
				System.out.println("not a rotation");

			}

		} else {
			System.out.println("not a rotation");
		}
	}


}
