package lib.utils;

import lib.sorters.Sorter;

public class SorterManager {
	public static <T extends Comparable<T>> long getSortingTime(T[] elements,
			Sorter sorter) {
		long time = System.nanoTime();
		sorter.sort(elements);

		return System.nanoTime() - time;
	}
}
