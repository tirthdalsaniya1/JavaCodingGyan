package trial;

import java.util.LinkedHashSet;

public class Trial10900 {
    public static void main(String[] args) {
        String str = "My Name is Tirth";
        LinkedHashSet<Character> uniqueSet = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!uniqueSet.contains(c)) {
            	uniqueSet.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : uniqueSet) {
            result.append(c);
        }

        System.out.println(result);
    }
}