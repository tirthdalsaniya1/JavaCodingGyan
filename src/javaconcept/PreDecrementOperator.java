package javaconcept;

public class PreDecrementOperator {

	public static void main(String[] args) {
		int x = 5;
		int y = --x; // Pre-decrement: x is decremented before assigning to y
		System.out.println(x); // Output: 4 (x is decremented first)
		System.out.println(y); // Output: 4 (y gets the updated value of x)

	}

}
