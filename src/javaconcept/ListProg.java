package javaconcept;

public class ListProg {

	public static void main(String[] args) {

		GetterSetterClass gsc = new GetterSetterClass();
		gsc.setColor("Red");
		gsc.setName("Punch");
		gsc.setPrice(1000000);
		
		System.out.println(gsc.getColor());
		System.out.println(gsc.getName());
		System.err.println(gsc.getPrice());
		System.out.print("abc");
		System.out.print("abc");
		System.out.printf("abc");
		System.out.printf("abc");

	}

}