package collections.documentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;


//https://dev.java/learn/storing-elements-in-a-collection/

public class UnderstandingCollection {

	public static void main(String[] args) {

		Collection<String> namesCollection = new ArrayList<>();

		namesCollection.add("first name");
		namesCollection.add("second Namettt");
		namesCollection.add("Third Namesttt");

		Collection<String> names = new ArrayList<>();

		names.add("first name");
		names.add("second Name");
		names.add("Third Name");
		System.out.println("names contains Third Name ? " + names.contains("Third Name"));
		System.out.println("names: " + names);
		names.remove("Third Name");
		System.out.println("names after removal: " + names);
		System.out.println("if now names contains Third Name ? " + names.contains("Third Name"));

		// some All methods of above
		names.addAll(namesCollection);
		System.out.println("added namesCollection with names look : " + names);
		System.out.println("This method will return true when all elements of one are present in the collection: "
				+ names.containsAll(namesCollection));

//		now we will remove names collections
		names.removeAll(namesCollection);
		System.out.println("removed namesCollection "+names);
		namesCollection.add("second Name");
		System.out.println("namescollection retain use "+namesCollection.retainAll(names));
		System.out.println("names: "+names+" namesCollection "+namesCollection);
		if(names.isEmpty()) {
			System.out.println("names is Empty");
		}else {
			System.out.println("Size of names "+names.size());
		}
		//we can delete elements using clear!!
//		names.add("hello");
		names.clear();
		System.out.println("after clearing: ");
		if(names.isEmpty()) {
			System.out.println("names is Empty");
		}else {
			System.out.println("Size of names "+names.size());
		}
		
		//creating Array of Collection 
		Collection<String> strings = List.of("one", "two");

		String[] largerTab = {"three", "three", "three", "I", "was", "there"};
		System.out.println("largerTab = " + Arrays.toString(largerTab));

		//Converting to Arrays
		String[] result = strings.toArray(largerTab); //it will add null after collections values are added in Array
		
		System.out.println("result = " + Arrays.toString(result));

		System.out.println("Same arrays? " + (result == largerTab));
		//it will work for zero length array as well

		String[] zeroLengthTab = {};
		String[] results = strings.toArray(zeroLengthTab);

		System.out.println("zeroLengthTab = " + Arrays.toString(zeroLengthTab));
		System.out.println("result = " + Arrays.toString(results));
		
		//functional programming
		Predicate<String> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
		//
		

	}

}
