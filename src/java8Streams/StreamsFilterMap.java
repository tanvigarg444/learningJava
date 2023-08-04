package java8Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Customer;

public class StreamsFilterMap {

	public static void main(String[] args) {

		// list of customer objects
		List<Customer> customerList = Arrays.asList(new Customer("Tom", 30), new Customer("Steve", 31),
				new Customer("Peter", 32), new Customer("Simon", 33));

		String name = customerList.stream().filter(c -> "Peter".equals(c.getName())).map(Customer::getName).findAny()
				.orElse(null);
		System.out.println(name);

		// print all the names from the list
		List<String> custList = customerList.stream().map(Customer::getName).collect(Collectors.toList());
		custList.forEach(System.out::println);

	}

}
