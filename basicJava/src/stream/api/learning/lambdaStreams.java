package stream.api.learning;

import java.util.Arrays;
import java.util.stream.Stream;

public class lambdaStreams {

	public static void main(String[] args) {

		var numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		long currentTimeMillis2 = System.currentTimeMillis();
		Integer reduce = numbers.stream().reduce(0,(total, e) -> Integer.sum(total, e));
		System.out.println(System.currentTimeMillis() - currentTimeMillis2);
		System.out.println(reduce);

		// you know what, let's make this even better !! using method
		// referencing

		Integer reduced2 = numbers.parallelStream().mapToInt(e -> e).sum();
		System.out.println(reduced2);

		// Other Example

		String concatStr = numbers.parallelStream().map(String::valueOf)
				.reduce("", (carry, str) -> carry.concat(str));
		System.out.println(concatStr);

		// you know what, let's make this even better !! using method
		// referencing
		String concatStr2 = numbers.parallelStream().map(String::valueOf)
				.reduce("", String::concat);
		System.out.println(concatStr2);
		
		
		
		//infinte Streams
		
		
		int sumOfFirst20EvenNumbersOfWhichSqrtIsGreaterThan20AndDoubled = 
		 Stream.iterate(121, e->e+1) /*unbounded and Lazy*/
			   .filter(e -> e%2==0)
			   .filter(e -> Math.sqrt(e) > 20)
			   .mapToInt(e-> e*2)
			   .limit(51)
			   .sum();
		
		System.out.println(sumOfFirst20EvenNumbersOfWhichSqrtIsGreaterThan20AndDoubled);

	}

}
