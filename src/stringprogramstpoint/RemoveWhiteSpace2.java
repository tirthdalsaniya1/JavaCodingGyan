package stringprogramstpoint;

public class RemoveWhiteSpace2 {

	public static void main(String[] args) {

		String s = " Remove white spaces ";
		System.out.println("before removing white space " + s.length());

		String f = s.replaceAll(" ", "");

		System.out.println(f);
		System.out.println("after removing white space " + f.length());

	}

}
