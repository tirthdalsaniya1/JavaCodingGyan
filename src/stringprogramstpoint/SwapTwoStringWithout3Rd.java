package stringprogramstpoint;

public class SwapTwoStringWithout3Rd {
	public static void main(String[] args) {

		String str = "i.like.this.program.very.much";

		String[] arr = str.split(".");
		StringBuilder rev = new StringBuilder();
		for (int i = arr.length - 1; i >= 0; i--) {

			rev = rev.append(arr[i]);

		}
		
		System.out.println(rev);

	}
}
