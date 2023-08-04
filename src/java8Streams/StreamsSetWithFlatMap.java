package java8Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import pojo.Employee;

public class StreamsSetWithFlatMap {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setName("Tanvi");
		emp1.addDevices("iPhone8");
		emp1.addDevices("Samsung9");
		emp1.addDevices("iPhonex");
		emp1.addDevices("macbook pro");

		Employee emp2 = new Employee();
		emp2.setName("Tom");
		emp2.addDevices("lenovo windows10");
		emp2.addDevices("Samsung9");
		emp2.addDevices("iPhone9");
		emp2.addDevices("macbook air");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);

		List<String> deviceList = empList.stream().map(x -> x.getDevices()) // Stream<Set<String>>
				.flatMap(x -> x.stream()) // Stream<String>
				.distinct().collect(Collectors.toList());
		deviceList.forEach(System.out::println);

	}

}
