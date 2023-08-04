package java8FunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * 
 * @author act21
 * @implNote Represents an operation on a single operand that produces a result
 *          of the same type as its operand. This is a specialization of
 *          Function for the case where the operand and result are of the same
 *          type.
 *
 */
public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) {

		UnaryOperator<Integer> func = (x) -> x * 7;
		int res = func.apply(10);
		System.out.println(res);

		Function<Integer, Integer> func1 = x -> x * 10;
		int res1 = func1.apply(40);
		System.out.println(res1);

		List<String> langList = new ArrayList<String>();
		langList.add("Java");
		langList.add("Ruby");
		langList.add("Python");

		System.out.println(langList);

		langList.replaceAll(ele -> (ele + "Tanvi"));
		System.out.println(langList);
	}

}
