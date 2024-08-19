package javaconcept2;

public class JavaPassByRef {
	int length;

	public static void main(String[] args) {
		JavaPassByRef example = new JavaPassByRef();
		example.length = 20;
		System.out.println("Before calling modifyLength: " + example.length);
		modifyLength(example);
		System.out.println("After calling modifyLength: " + example.length);
	}

	public static void modifyLength(JavaPassByRef example) {
		example.length = 30;
		System.out.println("Inside modifyLength: " + example.length);
	}
}