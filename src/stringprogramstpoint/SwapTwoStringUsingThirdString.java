package stringprogramstpoint;

public class SwapTwoStringUsingThirdString {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		String temp = "";

		temp = s1;
		s1 = s2;
		s2 = temp;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(temp);

	}

}
