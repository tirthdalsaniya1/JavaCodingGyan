package stringprogramstpoint;

public class CheckGivenStringIsARotationOfAnother {

	public static void main(String[] args) {
		String s1 = "abcde", s2 = "deabc";

		boolean isRotation = false;
		if (s1.length() != s2.length()) {
			System.out.println("Second string is not a rotation of first string");
		}

		else {
			// Concatenate s1 with s1 and store it in s1
			s1 = s1.concat(s1); // abcdeabcde
			// Check whether s2 is present in s1
			if (s1.contains(s2)) {
				isRotation = true;
			} else {
				isRotation = false;
			}
		}
		System.out.println(isRotation);

	}

}