package lib.utils;

import lib.sorters.Sorter;

import java.util.Comparator;

public class SorterManager {

    public static <T extends Comparable<T>> long getSortingTime(T[] elements,
                                                                Sorter sorter) {
        long time = System.nanoTime();
        sorter.sort(elements);

        return System.nanoTime() - time;
    }

    public static <T> long getSortingTime(T[] elements, Sorter sorter,
                                          Comparator<? super T> comparator) {
        long time = System.nanoTime();
        sorter.sort(elements, comparator);

        return System.nanoTime() - time;
    }
}
