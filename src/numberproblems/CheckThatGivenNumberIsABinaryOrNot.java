package numberproblems;

public class CheckThatGivenNumberIsABinaryOrNot {

	public static void main(String[] args) {

		/*
		 * 
		 * if number contains only 0 and 1 then its binary number else its not binary
		 * 101010 = true 121 = false
		 */
		int n = 101010;// true
		// 123= false
		boolean isBinary = false;
		String s = String.valueOf(n);

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			if ((c != '0') && (c != '1')) {
				System.out.println("found char other than 0 or 1");
				isBinary = false;
				break;
			} else {
				isBinary = true;
			}
		}

		if (isBinary) {
			System.out.println(n + " number is a binary num");
		} else {
			System.out.println(n + " number is not a binary num");

		}

	}

}
