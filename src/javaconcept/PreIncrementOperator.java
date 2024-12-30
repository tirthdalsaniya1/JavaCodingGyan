package javaconcept;

public class PreIncrementOperator {

	public static void main(String[] args) {
		int x = 5;
		int y = ++x; // Pre-increment: x is incremented before assigning to y
		System.out.println(x); // Output: 6 (x is incremented before assigning to y)
		System.out.println(y); // Output: 6 (y gets the updated value of x)

	}

}
