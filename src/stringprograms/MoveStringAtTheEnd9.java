package stringprograms;
public class MoveStringAtTheEnd9 {

	public static void main(String[] args) {

		String input = "102030405060";
		StringBuilder numStr = new StringBuilder();
		StringBuilder zeroStr = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			int j = (input.charAt(i) - '0');
			if (j == 0) {
				zeroStr.append(input.charAt(i));
			}
			if (j != 0) {
				numStr.append(input.charAt(i));
			}
		}
		System.out.println(zeroStr.append(numStr));
	}

}