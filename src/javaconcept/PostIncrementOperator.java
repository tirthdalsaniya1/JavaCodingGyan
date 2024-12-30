package javaconcept;

public class PostIncrementOperator {

	public static void main(String[] args) {
		int x = 5;
		int y = x++; // Post-increment: y gets the value of x before incrementing
		System.out.println(x); // Output: 6 (x is incremented after assigning to y)
		System.out.println(y); // Output: 5 (y gets the original value of x)

	}

}
