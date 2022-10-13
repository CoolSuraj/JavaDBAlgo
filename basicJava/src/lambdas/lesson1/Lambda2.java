package lambdas.lesson1;

import java.util.Objects;
import java.util.function.*;

public class Lambda2 {

	public static void main(String[] args) {
		Consumer<String> printer = s -> System.out.println(s);

		// Sometimes a lambda expression is just a reference to an existing method
		Consumer<String> printer2 = System.out::println; // it is as same as printer

		printer.accept("Shree");
		printer2.accept("shree");

		/*
		 * There are four categories of method references:
		 * 
		 Static method references
		 Bound method references 
		 Unbound method references
		 Constructor method references
		 */
		
		//Static Method References
		DoubleUnaryOperator sqrt = Math::sqrt;
		double applyAsDouble = sqrt.applyAsDouble(4);
		System.out.println(applyAsDouble);
		
//		This particular method reference refers to a static method and is thus called a static method reference. 
//		The general syntax of a static method reference is RefType::staticMethod.
		
//		A static method reference may take more than one argument. Consider the following code:
		IntBinaryOperator max = Math::max;
		int applyAsInt = max.applyAsInt(1, 21);
		System.out.println(applyAsInt);
		
		
		//Writing Unbound Method References
		
//		Methods That Do Not Take Any Argument
		ToIntFunction<String> toLength = s -> s.length();
		// Function<String, Integer> toLength = s -> s.length();  //same as this one
		//		can be shown like
		
		ToIntFunction<String> toLength1 = String::length;
		System.out.println(toLength1.applyAsInt("String"));
		
//		You can call any getter from a plain Java bean with such a method reference. Suppose you have User class with a getName() defined on it.
//		Function<String,String> getName = User::getName;
		
//		Writing Bound Method References
		Consumer<String> printerd = System.out::println;
		
		Predicate<String> isNull = Objects::isNull;
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
		Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();
		Predicate<String> shorterThan5 = s -> s.length() < 5;

		Predicate<String> p = isNotNullNorEmpty.and(shorterThan5);
		System.out.println(p.test("asdf"));


		
		
		
		System.gc();
		
		

	}

}
