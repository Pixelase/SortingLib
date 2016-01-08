package lib.sorters;

import java.util.Comparator;

public interface Sorter {
    <T extends Comparable<? super T>> void sort(T[] elements);

    <T> void sort(T[] elements, Comparator<? super T> comparator);
}
