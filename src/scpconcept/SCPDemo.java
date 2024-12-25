package scpconcept;

public class SCPDemo {

	public static void main(String[] args) {
		String s1 = "Avdhoot";
		String s2 = "Avdhoot";
		String s3 = "Avdhoot";
		String s4 = new String("Avdhoot");
		System.out.println("Demo Of equal method when we compare value s1 and s2 " + s1.equals(s2)); // true
		System.out.println("s1 and s2 memory address compare " + (s1 == s2)); // true
		System.out.println("Demo Of equal method  when we compare value s1 and s4 " + s1.equals(s4)); // true
		System.out.println("s1 and s4 memory address compare " + (s1 == s4)); // false
		s4 = s4.intern();
		System.out.println("used equal method after intern method call, we compared value s2 and s4 " + s2.equals(s4)); // true
		System.out.println("compared address of s2 and s4 after intern method call " + (s2 == s4)); // true

	}

}
