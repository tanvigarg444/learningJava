package arrayListIterationMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");

		// 1. using java 8 with for each loop and lambda expression
		tvSeries.forEach(show -> {
			System.out.println(show);
		});

		// 2. using iterator
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String show = it.next();
			System.out.println(show);
		}

		// 3. using iterator and java 8 lambda & forEachRemaining() method
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		// 4. using for each loop
		for (String show : tvSeries) {
			System.out.println(show);
		}

		// 5. using for loop with order/index
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		// 6. using listIterator() to traverse in both the directions
		ListIterator<String> listIt = tvSeries.listIterator(tvSeries.size());
		while (listIt.hasPrevious()) {
			String show = listIt.previous();
			System.out.println(show);
		}

	}

}
