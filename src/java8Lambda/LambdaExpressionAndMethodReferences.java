package java8Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressionAndMethodReferences {

	public static void main(String[] args) {

		List<String> nameList = Arrays.asList("Tom", "Peter", "Tanvi", "Simon");

		// for loop
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}

		// for each loop
		for (String s : nameList) {
			System.out.println(s);
		}

		// 1. With Anonymous class
		nameList.forEach(new Consumer<String>() { // Anonymous class

			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

		// 2. Lambda Example
		nameList.forEach(str -> System.out.println(str));

		// 3. Method References
		nameList.forEach(System.out::println);

	}

}
