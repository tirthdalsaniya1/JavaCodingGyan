package stringprograms;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubString {

	public static void main(String[] args) {
		String s = "abc";
		List<String> rotations = new ArrayList<>();

		for (int i = 0; i < s.length(); i++) {

			String r = s.substring(i) + s.substring(0, i);
			rotations.add(r);

		}
		System.out.println(rotations);
	}

}
