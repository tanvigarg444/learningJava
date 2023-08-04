package java8Streams;

import java.util.Arrays;
import java.util.List;

import pojo.Customer;

public class StreamsFilterFindAnyOrElse {

	public static void main(String[] args) {

		// list of customer objects
		List<Customer> customerList = Arrays.asList(new Customer("Tom", 30), new Customer("Steve", 31),
				new Customer("Peter", 32), new Customer("Simon", 33));

		// 1. filter-findAny
		Customer customer = customerList.stream().filter(c -> "Peter".equals(c.getName())).findAny().orElse(null);

		System.out.println(customer.getName() + " " + customer.getAge());

		// 2. filter-didn't find any orElse
		Customer customer1 = customerList.stream().filter(c -> "Tanvi".equals(c.getName())).findAny().orElse(null);
		System.out.println(customer1);

		// 3. filter with multiple conditions
		Customer customer2 = customerList.stream().filter(c -> "Simon".equals(c.getName()) && 23 == c.getAge())
				.findAny().orElse(null);
		System.out.println(customer2.getName() + " " + customer2.getAge());

	}

}
