package stringprograms;

public class PrintEachCharTwiceInAString {

	public static void main(String[] args) {
		String s = "say hi";

		// output = ssaayy hhii (for space dont print it twice)
		StringBuilder str = new StringBuilder();
		for (char c : s.toCharArray()) {
			if (c != ' ')
				str.append(c).append(c);
			else
				str.append(c);
			
		}

		System.out.println(str);

	}

}
