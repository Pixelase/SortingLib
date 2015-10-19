package lib.sorters;

import java.util.Comparator;

public class ShellSorter implements Sorter {

	private <T> void shellSort(T[] elements, Comparator<? super T> comparator) {
		int j;
		for (int gap = elements.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < elements.length; i++) {
				T tmp = elements[i];
				for (j = i; j >= gap
						&& comparator.compare(tmp, elements[j - gap]) < 0; j -= gap) {
					elements[j] = elements[j - gap];
				}
				elements[j] = tmp;
			}
		}
	}

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {
		shellSort(elements, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});
	}

	@Override
	public <T> void sort(T[] elements, Comparator<? super T> comparator) {
		shellSort(elements, comparator);
	}

}
