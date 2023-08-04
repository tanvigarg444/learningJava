package java8Streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {

	public static void main(String[] args) {
		// System.out.println(isPrime(2));
		long t1, t2;

		t1 = System.currentTimeMillis();
		long count = Stream.iterate(0, n -> n + 1).limit(500000).parallel()
				.filter(PrimeNumberWithParallelStream::isPrime).peek(x -> System.out.println(x)).count();
		System.out.println(count);
		t2 = System.currentTimeMillis();

		System.out.println((t2 - t1) / 1000);

		// for parallel:
		// total prime numbers : 41538
		// total time taken : 23

		// for sequential:
		// total prime numbers : 41538
		// total time taken : 52

	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		return !IntStream.rangeClosed(2, number / 2).anyMatch(x -> number % x == 0);
	}

}
