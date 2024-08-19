package stringprograms;
public class CountSpaceWithoutLoopFromString {

	public static void main(String[] args) {

		String str = "javajava java j a";
	
		// provide character or space inside replace method
		int i = str.length() - (str.replace(" ", "").length());
		System.out.println(i);

	}

}
