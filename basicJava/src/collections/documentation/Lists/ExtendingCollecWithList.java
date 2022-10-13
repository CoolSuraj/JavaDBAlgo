package collections.documentation.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class ExtendingCollecWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<>(List.of("suraj", "sanjay", "Gurav"));
		System.out.println(strings);
		strings.add("Ayodhya");
		System.out.println(strings);
		System.out.println(strings.subList(2, 4));// should print Gurav Ayodhya
		System.out.println(strings.get(0));
		strings.set(0, "Abhishek");
		System.out.println(strings.indexOf("sanjay")); // if not there it returns -1
		List<String> Names = new ArrayList<String>();
		Names.addAll(strings);
		Names.remove(2);
		System.out.println(Names);

//		strings.sort(null);  //java SE11+
		strings.sort(Comparator.naturalOrder());// this is same as strings.sort(null); //java SE8+
//		Collections.sort(strings);
		System.out.println("Sorted " + strings);

		List<String> numbers = Arrays.asList("one", "two", "three");
		for (ListIterator<String> iterator = numbers.listIterator(); iterator.hasNext();) {
			String nextElement = iterator.next();
			if (Objects.equals(nextElement, "two")) {
				iterator.set("2");
			}
		}
		System.out.println("numbers = " + numbers);

	}

}
