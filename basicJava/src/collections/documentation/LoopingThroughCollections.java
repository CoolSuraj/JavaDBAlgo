package collections.documentation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LoopingThroughCollections {

	public static void main(String[] args) {
		// https://dev.java/learn/iterating-over-the-elements-of-a-collection/

		Collection<String> strings = List.of("one", "two", "three");

		// forEach Loop
		for (String string : strings) {
			System.out.println(string);
		}

		// using iterator over collection
		/*
		 * Iterating over the elements of a collection using this object is a two-steps
		 * process.
		 * 
		 * 1. First you need to check if there are more elements to be visited with the
		 * hasNext() method 
		 * 2. Then you can advance to the next element with the next()
		 * method. 
		 * 
		 * If you call the next() method but there are no more elements in the
		 * collection, you will get a NoSuchElementException. Calling hasNext() is not
		 * mandatory, it is there to help you to make sure that there is indeed a next
		 * element.
		 */
		for(Iterator<String> iter = strings.iterator() ; iter.hasNext() ;/*No need of condition here*/) {
			String str2 = iter.next();
			if(str2.equals("three")) {
//				iter.remove();  //this method not works on ImmutableCollections like List.of
				continue;
			}
			System.out.println(str2);
		}
		
//		Collection<String> strings2 = new ArrayList<>();
//		strings2.add("one");
//		strings2.add("two");
//
//		Iterator<String> iterator = strings2.iterator();
//		while (iterator.hasNext()) {
//
//		    String element = iterator.next();
//		    strings.remove(element);
//		}
		
		
		//we can implement Iterable interface as well since Java 16
		for(int i : new Range(0,5)) {
			System.out.println(i);
		}

	}

}

class Range implements Iterable<Integer>{
	private final int start;
	private final int end;
	
	public Range(int start, int end) {
		
		this.start = start;
		this.end = end;
	}

	@Override
	public Iterator<Integer> iterator() {
		return  new Iterator<Integer>() {
			private int index =start;
			
			@Override
			public boolean hasNext() {
				return index <end;
				
			}

			@Override
			public Integer next() {
				if(index > end)
					  throw new NoSuchElementException("" + index);
				
				int currentIndex = index;
				index++;
				return currentIndex;
			}
			
		};
	}
	
	
	
}
