package java8FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * 
 * @author act21
 * @implNote Represents a predicate (boolean-valued function) of one argument.
 *           This is a functional interface whose functional method is
 *           test(Object). Type Parameters:<T> the type of the input to the
 *           predicate
 */
public class PredicateInterfaceConcept {

	public static void main(String[] args) {
		Predicate<Integer> p = x -> x > 5;
		Boolean b = p.test(11);
		System.out.println(b);

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collectionList = list.stream().filter(p).collect(Collectors.toList());
		System.out.println(collectionList);

		// predicate with && (|| also can be applied)
		collectionList = list.stream().filter(x -> x > 5 && x < 9).collect(Collectors.toList());
		System.out.println(collectionList);

		// predicate with negate()
		List<String> nameList = Arrays.asList("Tanvi", "Tanv", "Tan", "Java", "Jav", "Ja", "J");
		Predicate<String> namePred = x -> x.startsWith("Tan");
		List<String> filteredNameList = nameList.stream().filter(namePred.negate()).collect(Collectors.toList());
		System.out.println(filteredNameList);

	}

}
