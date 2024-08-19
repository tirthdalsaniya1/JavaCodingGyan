package stringprograms;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {

		String s = "Abc@#$%^&*()091234";

		s = s.replaceAll("[^a-zA-Z0-9]", "");

		System.out.println(s);

	}

}
