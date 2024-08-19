package stringprogramstpoint;

public class SwapTwoStringWithout3Rd {
	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";

		System.out.println("Before swap: str1 = " + str1 + ", str2 = " + str2);

		// Concatenate str1 and str2 and assign to str1
		str1 = str1 + str2; // str1 = "HelloWorld"

		// Extract the original str2 from the concatenated string and assign to str2
		str2 = str1.substring(0, str1.length() - str2.length()); // str2 = "Hello"

		// Extract the original str1 from the concatenated string and assign to str1
		str1 = str1.substring(str2.length()); // str1 = "World"

		System.out.println("After swap: str1 = " + str1 + ", str2 = " + str2);
	}
}
