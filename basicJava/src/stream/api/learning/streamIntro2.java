package stream.api.learning;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamIntro2 {

	public static void main(String[] args) {
		//Approach 1 to parseInt list with some false strings
		Function<String, Stream<Integer>> flatParser = s -> {
		    try {
		        return Stream.of(Integer.parseInt(s));
		    } catch (NumberFormatException e) {
		    }
		    return Stream.empty();
		};

		List<String> strings = List.of("2", " ", "1", "3 ", "5", "3","1","");
		List<Integer> intsList = 
		    strings.stream()
		           .flatMap(flatParser)
		           .collect(Collectors.toList());
		System.out.println("ints = " + intsList);

		//Apprach 2 from Java 16
		List<Integer> ints =
		        strings.stream()
		               .<Integer>mapMulti((string, consumer) -> {
		                    try {
		                        consumer.accept(Integer.parseInt(string));
		                    } catch (NumberFormatException ignored) {
		                    }
		               })
		               .sorted()/* This method is provided by Stream to sort out the elements*/
		               .distinct()/* This is another method provided by Stream to get Each value Separately*/
		               .collect(Collectors.toList());
		System.out.println("ints = " + ints);

		List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
		
		List<Integer> listFromTwoEight = nums.stream()
											 .skip(2)
											 .limit(5)
											 .collect(Collectors.toList());
		System.out.println(listFromTwoEight);

		
	}

}
