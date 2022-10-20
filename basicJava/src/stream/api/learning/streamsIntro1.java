package stream.api.learning;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class streamsIntro1 {
	/*
	 * Stream is implementation of MapFilterReduce Algorithm Which is orignally
	 * termed by google and it says to use multple servers and divide the work and
	 * make it work parallel You can see the Stream API as a companion framework to
	 * the Collections Framework, to process this data in a very efficient way.
	 * Indeed, you can open a stream on a collection to process the data it
	 * contains.
	 * 
	 */
	public static void main(String[] args) {
		//Ex1
		//One non functional way below
		List<Sale> sales = new ArrayList<Sale>(); // this is the list of all the sales
		 LocalDate localdate = LocalDate.of(2020, 3, 13); 
		sales.add(new Sale("one",localdate,500));
		sales.add(new Sale("two",localdate,7500));
		sales.add(new Sale("one",localdate,9500));
		
		int amountSoldInMarch = 0;
		
		for (Sale sale: sales) {
		    if (sale.getDate().getMonth() == Month.MARCH) {
		        amountSoldInMarch += sale.getAmount();
		    }
		}
		System.out.println("Amount sold in March: " + amountSoldInMarch);
		//Intro Map Filter Reduce
//		A mapping changes the types of objects; it does not change their number.
//		A filtering changes the number of objects; it does not change their type.
		List<String> strings = List.of("one", "two", "three", "four");
		List<Integer> lengths = strings.stream()
		                               .map(String::length)
		                               .collect(Collectors.toList());
		System.out.println(lengths);
		
		IntSummaryStatistics stats = strings.stream()
											.mapToInt(String::length)
											.summaryStatistics();
		System.out.println("stats = " + stats);
		
		long length = strings.stream()
				.mapToInt(String::length)
				.filter(s-> s>3)
				.count();
		System.out.println(length);
			
		
		//Flatmapping a Stream to Handle 1:p Relations

		List<State> states = new ArrayList<State>();
		City one = new City("one",345654);
		City two = new City("Two",12000);
		City three = new City("three",689789);
		City four = new City("four",10000);
		
		List<City> onesc = List.of(one,two);
		List<City> twosc = List.of(three,four);
		State ones = new State("ones",onesc);
		State twos  = new State("twos",twosc);
		
		states.add(ones);
		states.add(twos);
		
		int totalPopulation = 0;
//		for (State state: states) {
//		    for (City city: state.getCities()) {
//		        totalPopulation += city.getPopulation();
//		    }
//		}
//
//		System.out.println("Total population = " + totalPopulation);
		//For above problem to get solved we use something called FlatMap which is then used to get all the one to many relation as single stream
		totalPopulation = states.stream()
								.flatMap(state -> state.getCities().stream())
								.mapToInt(City::getPopulation)
								.sum();
		System.out.println("Total population = " + totalPopulation);
	}

}
