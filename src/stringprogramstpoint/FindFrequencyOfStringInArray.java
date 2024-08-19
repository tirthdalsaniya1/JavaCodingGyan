package stringprogramstpoint;

public class FindFrequencyOfStringInArray {

	public static void main(String[] args) {
		String[] str = { "abc", "pqr", "ttt", "xyz", "pqr", "abc", "ccc", "ccc" };
		int count;

		for (int i = 0; i < str.length; i++) {
			count = 1;
			for (int j = i + 1; j < str.length; j++) {
				if (str[i].equals(str[j])) {
					count++;
					// Set str[j] to "" to avoid printing visited string
					str[j] = "";
				}
			}

			if (count > 1 && !str[i].equals("")) {
				System.out.println(str[i] + " occurance is " + count);
			}
		}

	}

}
