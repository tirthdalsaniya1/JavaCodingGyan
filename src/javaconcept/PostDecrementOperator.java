package javaconcept;

public class PostDecrementOperator {

	public static void main(String[] args) {

		int x = 5;
		int y = x--; // Post-decrement: y gets the value of x before decrementing
		System.out.println(x); // Output: 4 (x is decremented after assigning to y)
		System.out.println(y); // Output: 5 (y gets the original value of x)

	}

}
