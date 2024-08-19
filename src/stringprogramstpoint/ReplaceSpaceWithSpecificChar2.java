package stringprogramstpoint;

public class ReplaceSpaceWithSpecificChar2 {

	public static void main(String[] args) {
		String str = "Once in a blue moon";
		// Output = Once-in-a-blue-moon
		str = str.replaceAll("\\s", "-");
		System.out.println(str);

	}

}
