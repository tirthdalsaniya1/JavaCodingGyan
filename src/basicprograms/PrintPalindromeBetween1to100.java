package basicprograms;

public class PrintPalindromeBetween1to100 {
	public static void main(String[] args) {
		for (int i = 1; i <= 200; i++) {
			int originalNum = i;
			int num = i;
			int rev = 0;
			while (num > 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}

			// Check if the original number is equal to its reversed version
			if (originalNum == rev) {
				System.out.println(originalNum + " is a palindrome");
			}
		}
	}
}