package trial;

import java.util.LinkedHashSet;

import javaconcept.Abc;
import javaconcept.Interface1;
import javaconcept.Interface2;

public class Trial10900  extends Abc implements Interface1, Interface2{
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

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
}