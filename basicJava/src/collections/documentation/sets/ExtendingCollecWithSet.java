package collections.documentation.sets;

import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ExtendingCollecWithSet {

	public static void main(String[] args) {
		Set<String> setOfNos= new HashSet<>();
		setOfNos.addAll(List.of("one","two","three","four"));
		//setOfNos.forEach(System.out::println);  //order is not fixed in set
		
		//for sorted order 
		/*There is Interface also present called SortedSet which is implemented by TreeSet*/
		SortedSet<String> sortedSet = new TreeSet<>();
		sortedSet.addAll(List.of("one","two","three","four"));
		sortedSet.forEach(System.out::println);
		System.out.println(sortedSet.first());
		//sortedSet with additional implementations by NavigableSet
		NavigableSet<String> sortedStrings = new TreeSet<>();
		sortedStrings.addAll(sortedSet);
		System.out.println(sortedStrings.floor("three"));
		sortedStrings.pollLast();
		NavigableSet<String> reversedSortedStrings = sortedStrings.descendingSet();
		System.out.println(reversedSortedStrings);
	}

}
                                                       