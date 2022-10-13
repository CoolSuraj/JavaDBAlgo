package amigos.functionalProgrammingLessons.imparative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Lesson1FP {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<Person>();
		Person per1 = new Person("suraj",Gender.MALE);
		Person per2 = new Person("Alexis",Gender.FEMALE);
		Person per3 = new Person("abhu",Gender.MALE);
		Person per4 = new Person("trisha",Gender.FEMALE);
		Person per5 = new Person("Jire",Gender.MALE);
		Person per6 = new Person("maria",Gender.FEMALE);
		
		people.add(per1);
		people.add(per2);
		people.add(per3);
		people.add(per4);
		people.add(per5);
		people.add(per6);
		
		//This is what called Imperative Approach
		List<Person> females = new ArrayList<>();
		for(Person person : people) {
			if(person.getGender().equals(Gender.FEMALE)) {
				females.add(person);
			}
		}
		
		System.out.println(females);
		
		//Now we will use Declarative Approach symonm to functional programming
		System.out.println("//Declarative Approach");
		/*//this is just to print 
		 * people.stream()
			  .filter(person -> Gender.FEMALE.equals(person.getGender()))
			  .forEach(System.out::println);
		*/
		
		//to save in Collection
		
		/* 
		Predicate<Person> predicate = person -> Gender.FEMALE.equals(person.getGender());
		List<Person> females2 =  people.stream()
		  .filter(predicate)
		  .collect(Collectors.toList()); 
		  //The Below one is same as above 
		  */
		
		
		List<Person> females2 =  people.stream()
		  .filter(person -> Gender.FEMALE.equals(person.getGender()))
		  .collect(Collectors.toList());
		
		females2.forEach(System.out::println);
		
		//Predicate<T> Represents a predicate , boolean valued function of one argument
		// Predicate<? super Person> predicate = person -> Gender.FEMALE.equals(person.getGender());
		
		  
	}

}
