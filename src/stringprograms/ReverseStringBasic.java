package stringprograms;

public class ReverseStringBasic {

	public static void main(String[] args) {
		// Reverse a given String
		// Input : Tirth
		// Output : htriT

		String str = "Tirth";
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		System.out.println(reverseStr);
	}

}
