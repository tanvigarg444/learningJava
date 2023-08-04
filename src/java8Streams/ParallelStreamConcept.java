package java8Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.BaseStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreamConcept {

	public static void main(String[] args) {

		ForkJoinPool corePools = ForkJoinPool.commonPool();
		System.out.println(corePools.getParallelism());

		// 1. parallel() method on stream
		Stream stream = Stream.of("Tanvi", "Tom", "Selvin", "Peter", "Raj", "Simon");
		BaseStream parallelStream = stream.parallel();
		Stream.of("Tanvi", "Tom", "Selvin", "Peter", "Raj", "Simon").forEach(System.out::println);
		Stream.of("Tanvi", "Tom", "Selvin", "Peter", "Raj", "Simon").parallel().forEach(System.out::println);

		// 2. use parallelStream() method on a collection stream
		Arrays.asList("Tanvi", "Tom", "Selvin", "Peter", "Raj", "Simon").parallelStream().forEach(System.out::println);

		// 3. 1 to 10
		IntStream.range(1, 10).forEach(System.out::println);
		IntStream.range(1, 10).parallel().forEach(System.out::println);

		// 4. print from a-z --> 97-122
		// System.out.println(getAlphabetList());
		getAlphabetList().stream().forEach(System.out::println);
		getAlphabetList().parallelStream().forEach(System.out::println);
		
		// 5. check stream is running in parallel mode : isParallel() method
		System.out.println(IntStream.range(1, 10).isParallel()); // false
		System.out.println(IntStream.rangeClosed(1, 10).isParallel());  //true

	}

	public static List<String> getAlphabetList() {

		List<String> alpha = new ArrayList<String>();
		int n = 97;
		while (n <= 122) {
			char c = (char) n;
			alpha.add(String.valueOf(c));
			n++;
		}
		return alpha;
	}

}
