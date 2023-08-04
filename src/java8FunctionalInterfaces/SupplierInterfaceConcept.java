package java8FunctionalInterfaces;

import java.util.function.Supplier;

/**
 * 
 * @author act21
 * @implNote Represents a supplier of results. There is no requirement that a
 *           new or distinct result be returned each time the supplier is
 *           invoked. This is a functional interface whose functional method is
 *           get(). takes no args and return a result
 * 
 */
public class SupplierInterfaceConcept {

	public static void main(String[] args) {
		
		// supplier expression is: () -> "Java"
		getText(() -> "Java");
	}

	public static void getText(Supplier<String> text) {
		System.out.println(text.get());
	}

}
