package trial;

public class Try11111 {

	public static void main(String[] args) {

		String str = "1020304050";

		StringBuffer zeroStr = new StringBuffer();
		StringBuffer nonZeroStr = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == '0') {
				zeroStr.append(str.charAt(i));
			} else {
				nonZeroStr.append(str.charAt(i));

			}

		}
		System.out.println(zeroStr.append(nonZeroStr));
	}
}