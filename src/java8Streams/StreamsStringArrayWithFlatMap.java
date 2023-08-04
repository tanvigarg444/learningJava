package java8Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsStringArrayWithFlatMap {

	public static void main(String[] args) {

		String data[][] = new String[][] { { "a", "b" }, { "c", "d" }, { "e", "f" } };

		Stream<String[]> dataStream = Arrays.stream(data);

		// apply flatMap on dataStream
		Stream<String> dataStreamFlatMap = dataStream.flatMap(d -> Arrays.stream(d));

		Stream<String> dataStreamFilter = dataStreamFlatMap.filter(d -> "a".equals(d));

		dataStreamFilter.forEach(System.out::println);

		Stream<String> finalStream = Arrays.stream(data).flatMap(d -> Arrays.stream(d)).filter(d -> "c".equals(d));
		finalStream.forEach(System.out::println);

	}

}
