package javaconcept2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();

		/*
		 * list.add("a"); list.add("b"); list.add("c");
		 */
		list.add("0");
		list.add("30");
		list.add("20");
		list.add("1");
		System.out.println("List before " + list);
		List<String> alist = Collections.unmodifiableList(list);
		alist.add(null);
		System.out.println("List after " + alist);

	}

}