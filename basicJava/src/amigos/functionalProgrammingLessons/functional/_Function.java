package amigos.functionalProgrammingLessons.functional;

import java.util.function.Function;

public class _Function {
	
	static Function<Integer,Integer> incrementByOneFunction = 
			number -> number+1;
	public static void main(String[] args) {
		System.out.println(incrementor(0));
//		Integer inc = incrementByOneFunction.apply(1);
//		we can write this as
		int inc = incrementByOneFunction.apply(0);
		System.out.println(inc);
	}
	
	static int incrementor(int i) {
		return i+1;
	}
	
}
