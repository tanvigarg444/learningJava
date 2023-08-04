package java8FunctionalInterfaces;

import java.util.function.Function;

/**
 * 
 * @author act21
 * @implNote Represents a function that accepts one argument and produces a
 *           result. This is a functional interface whose functional method is
 *           apply(Object). Type Parameters: <T> the type of the input to the
 *           function <R> the type of the result of the function
 *
 */
public class FunctionInterfaceConcept {

	public static void main(String[] args) {

		Function<String, Integer> func = x -> x.length();
		int len = func.apply("This is Java8");
		System.out.println(len);

		// chaning function
		Function<Integer, Integer> func2 = x -> x * 2;
		int res = func.andThen(func2).apply("This is Tanvi");
		System.out.println(res);

	}

}