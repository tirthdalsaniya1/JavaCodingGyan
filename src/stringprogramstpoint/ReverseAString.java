package stringprogramstpoint;

public class ReverseAString {

	public static void main(String[] args) {

		String s = "grab";
		StringBuilder builder = new StringBuilder();

		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			builder.append(c);
			
		}
		System.out.println(builder);
	}

}
