package arrayprograms;
import java.util.ArrayList;
import java.util.List;

public class ReverseStringArrayInGivenManner2 {

	public static void main(String[] args) {

		String[] d = { "ABC", "ZZZ", "XYZ", "PER", "WER" };
		// Output = [CBA, ZZZ, ZYX, REP, REW]

		List<String> reverseStr = new ArrayList<>();
		for (int i = 0; i < d.length; i++) {
			String reverse = "";

			for (int j = d[i].length() - 1; j >= 0; j--) {
				reverse = reverse + d[i].charAt(j);
			}
			reverseStr.add(reverse);

		}
		System.out.println(reverseStr);
	}
}