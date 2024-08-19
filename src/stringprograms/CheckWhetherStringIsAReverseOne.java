package stringprograms;

public class CheckWhetherStringIsAReverseOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello jay";

		String s2 = "yaj olleh ";

		String reversedStr = "";
		for (int i = s1.length() - 1; i >= 0; i--) {
			reversedStr = reversedStr + s1.charAt(i);

		}
		System.out.println(reversedStr);
		if (s2.equals(reversedStr)) {
			System.out.println("s1 is reverse of s2");
		} else {
			System.out.println("s1 is not reverse of s2");
		}

	}

}
