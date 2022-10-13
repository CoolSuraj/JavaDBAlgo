package lambdas.lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Lambda1 {

	public static void main(String[] args) {
		/*
		 * Functional Programming Lambda With a little more than 40 interfaces, this
		 * package may look a little scary at first. It turns out that it is organized
		 * around four main interfaces. Understanding them gives you the key to
		 * understand all the others.
		 */
		/*
		 * The first interface is the Supplier<T> interface. In a nutshell, a supplier
		 * does not take any arguments and returns an object. it have get method that we
		 * can use
		 */

		Supplier<String> supplier = () -> "hello Supplier"; // this will simply return "Hello Supplier"
		System.out.println(supplier.get()); // need to use get method provided.

		Random random = new Random();
		Supplier<Integer> newRandom = () -> random.nextInt(10);

		for (int index = 0; index < 5; index++) {
			System.out.println(newRandom.get() + " "); // .get will call random.nextInt
		}
		// to optimize for Integer
		System.out.println();
		Random randoms = new Random(314L);
		IntSupplier newRandoms = () -> random.nextInt(10);
		for (int index = 0; index < 5; index++) {
			System.out.println(newRandoms.getAsInt()); // .getAsInt will call random.nextInt
		}
//		 IntSupplier, BooleanSupplier, LongSupplier and DoubleSupplier.
//		So for the supplier interfaces we have: getAsBoolean(), getAsInt(), getAsLong(), and getAsDouble().
		Consumer<String> printer = s -> System.out.println(s);
		printer.accept("Hello World");

		IntConsumer printint = i -> System.out.println(i);
		printint.accept(8);
		System.out.println();

		BiConsumer<Random, Integer> randomNumberPrinter = (randomb, number) -> {
			for (int i = 0; i < number; i++) {
				System.out.println("next random = " + randomb.nextInt(32));
			}
		};

		randomNumberPrinter.accept(randoms, 7);
		/*
		 * There are three specialized versions of the BiConsumer<T, U> interface to
		 * handle primitive types: ObjIntConsumer<T>, ObjLongConsumer<T> and
		 * ObjDoubleConsumer<T>.
		 * 
		 */
		System.out.println();

		// predicate it have test method and returns boolean
		Predicate<String> length3 = s -> s.length() == 3;
		String word = "..."; // any word
		boolean isOfLength3 = length3.test(word);
		System.out.println("Is of length 3? " + isOfLength3);

		// Along with Predicate<String> are three specialized interfaces: IntPredicate,
		// LongPredicate, and DoublePredicate.
		IntPredicate greaterthan10 = i -> i > 10; // we don't have to provide parenthisis for 1 param
		for (int j = 8; j < 13; j++) {
			System.out.println("is " + j + " is greater than 10 ? " + greaterthan10.test(j));
		}

		System.out.println();
		// we have the concept of bi Prdicate as well

		BiPredicate<String, Integer> lengthLessThanNum = (words, Num) -> words.length() < Num;
		System.out.println(lengthLessThanNum.test("killerTrain", 13));

		System.out.println();

		Function<String, Integer> toLength = s -> s.length();
		String worddd = "hella hella hi hi"; // any kind of word will do
		int lengthdd = toLength.apply(worddd);
		System.out.println(lengthdd);

		// Unary Operator
		List<String> strings = Arrays.asList("one", "two", "three");
		UnaryOperator<String> toUpperCase = wordd -> wordd.toUpperCase();
		strings.replaceAll(toUpperCase);
		System.out.println(strings);
		/*
		 * Firstly, what you need to remember is that there are 4 categories of
		 * interfaces:
		 * 
		 * the suppliers: do not take any argument, return something the consumers: take
		 * an argument, do not return anything the predicates: take an argument, return
		 * a boolean the functions: take an argument, return something Secondly: some
		 * interfaces have versions that take two arguments instead of one:
		 * 
		 * the biconsumers the bipredicates the bifunctions
		 */

	}

}
