package java8FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * 
 * @author act21
 * @implNote Represents an operation that accepts a single input argument and
 *           returns no result. Unlike most other functional interfaces,
 *           Consumer is expected to operate via side-effects.
 *
 */
public class ConsumerInterfaceConcept {

	public static void main(String[] args) {
		Consumer<String> func = x -> System.out.println(x);
		func.accept("Tanvi");

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		list.forEach(x -> System.out.println(x));
		
		list.forEach(System.out :: println);

	}

}
