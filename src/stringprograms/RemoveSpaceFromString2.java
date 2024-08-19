package stringprograms;
public class RemoveSpaceFromString2 {

	public static void main(String[] args) {

		String str = " Enter input string to be cleaned from white spaces...! ";
		String finalStr = str.replaceAll(" ", "");
		System.out.println(finalStr);

	}

}
