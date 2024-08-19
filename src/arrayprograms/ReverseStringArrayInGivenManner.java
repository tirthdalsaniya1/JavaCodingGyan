package arrayprograms;
import java.util.ArrayList;
import java.util.List;

public class ReverseStringArrayInGivenManner {

	public static void main(String[] args) {

		String[] d = { "ABC", "ZZZ", "XYZ", "PER", "WER" };
		// Output = [REW, REP, ZYX, ZZZ, CBA]

		List<String> reverseStr = new ArrayList<>();
		for (int i = d.length - 1; i >= 0; i--) {
			String reverse = "";

			for (int j = d[i].length() - 1; j >= 0; j--) {
				reverse = reverse + d[i].charAt(j);
			}
			reverseStr.add(reverse);

		}
		System.out.println(reverseStr.toString());
	}
}