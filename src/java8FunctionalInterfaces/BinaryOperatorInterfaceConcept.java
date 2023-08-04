package java8FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * 
 * @author act21
 * @implNote Represents an operation upon two operands of the same type,
 *          producing a result of the same type as the operands. This is a
 *          specialization of BiFunction for the case where the operands and the
 *          result are all of the same type.
 */
public class BinaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		BinaryOperator<Integer> func = (a, b) -> a + b;
		int res = func.apply(1, 2);
		System.out.println(res);

		// BiFunction Interface
		BiFunction<Integer, Integer, Integer> func1 = (a, b) -> (a + b);
		int res1 = func1.apply(30, 40);
		System.out.println(res1);
	}

}
