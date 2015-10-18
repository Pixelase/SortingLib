package lib.sorters;

import java.util.Comparator;

public interface Sorter {
	public <T extends Comparable<? super T>> void sort(T[] elements);

	public <T extends Comparable<? super T>> void sort(T[] elements,
			Comparator<? super T> comparator);
}
