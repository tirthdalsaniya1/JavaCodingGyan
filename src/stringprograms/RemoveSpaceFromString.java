package stringprograms;
public class RemoveSpaceFromString {

	public static void main(String[] args) {

		String str = " Enter input string to be cleaned from white spaces...! ";
		StringBuilder finalStringWithoutSpace = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c != ' ') {

				finalStringWithoutSpace.append(c);
			}
		}
		System.out.println(finalStringWithoutSpace);

	}

}
