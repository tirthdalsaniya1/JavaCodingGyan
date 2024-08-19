package arrayprograms;
import java.util.ArrayList;
import java.util.List;

public class ReverseStringArray {

	public static void main(String[] args) {

		String[] d = { "ABC", "ZZZ", "XYZ", "PER", "WER" };
		// Output = [WER, PER, XYZ, ZZZ, ABC]

		List<String> reverseStr = new ArrayList<>();
		for (int i = d.length - 1; i >= 0; i--) {

			reverseStr.add(d[i]);

		}
		System.out.println(reverseStr);
	}
}