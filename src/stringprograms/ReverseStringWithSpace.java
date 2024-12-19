package stringprograms;
public class ReverseStringWithSpace {

	public static void main(String[] args) {
		// Reverse a given String
		// input My name is anthony gonsalvis
		// output gonsalvis anthony is name My

		String str = "My name is anthony gonsalvis";
		String str2[] = str.split(" ");
		StringBuilder reversedString = new StringBuilder();

		for (int i = str2.length - 1; i >= 0; i--) {
			reversedString.append(str2[i]);
			if (i !=0) {
				reversedString.append(" ");
			}
		}
		System.out.println(reversedString);

	}
}