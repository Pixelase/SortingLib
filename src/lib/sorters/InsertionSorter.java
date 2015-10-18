package lib.sorters;

import java.util.Comparator;

public class InsertionSorter implements Sorter {

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {
		int j; // the number of items sorted so far
		T key; // the item to be inserted
		int i;
		for (j = 1; j < elements.length; j++) // Start with 1 (not 0)
		{
			key = elements[j];
			// Smaller values are moving up
			for (i = j - 1; (i >= 0) && (elements[i].compareTo(key) == 1); i--) {
				elements[i + 1] = elements[i];
			}
			elements[i + 1] = key; // Put the key in its proper location
		}
	}

	@Override
	public <T> void sort(T[] elements, Comparator<? super T> comparator) {
		int j; // the number of items sorted so far
		T key; // the item to be inserted
		int i;
		for (j = 1; j < elements.length; j++) // Start with 1 (not 0)
		{
			key = elements[j];
			// Smaller values are moving up
			for (i = j - 1; (i >= 0)
					&& (comparator.compare(elements[i], key) == 1); i--) {
				elements[i + 1] = elements[i];
			}
			elements[i + 1] = key; // Put the key in its proper location
		}
	}

}
