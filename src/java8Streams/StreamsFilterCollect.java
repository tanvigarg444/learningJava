package java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterCollect {

	public static void main(String[] args) {

		List<String> productList = Arrays.asList("MacBook", "iPhone", "Shoes", "Battery Charger", "Bat");

		System.out.println(productList);
		productList.forEach(p -> System.out.println(p));

		List<String> resultList = productList.stream().filter(p -> !p.equals("Shoes")).collect(Collectors.toList());
		resultList.forEach(r -> System.out.println(r));

		resultList.forEach(System.out::println);

	}

}
