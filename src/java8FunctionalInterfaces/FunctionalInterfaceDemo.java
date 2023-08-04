package java8FunctionalInterfaces;

@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	public void greek(); //only one abstract method, other static and default method can have in any numbers.
	
	public static void test() {
		
	}
	
	default void display() {
		
	}
	
	/**
	 * 6 Functional Interface in Java8 - 
	 * UnaryOperator<T>, 
	 * BinaryOperator<T>,
	 * Function<T,R>
	 * Predicate<T,U>
	 * Supplier<T>
	 * Consumer<T>
	 */

}