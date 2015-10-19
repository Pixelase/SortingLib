package lib.sorters;

import java.util.Comparator;

public class QuickSorter implements Sorter {

	private <T> void quickSort(T[] elements, int a, int b,
			Comparator<? super T> comparator) {
		if (a < b) {
			int i = a, j = b;
			T x = elements[(i + j) / 2];

			do {
				while (comparator.compare(elements[i], x) < 0)
					i++;
				while (comparator.compare(x, elements[j]) < 0)
					j--;

				if (i <= j) {
					T tmp = elements[i];
					elements[i] = elements[j];
					elements[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);

			quickSort(elements, a, j, comparator);
			quickSort(elements, i, b, comparator);
		}
	}

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {
		quickSort(elements, 0, elements.length - 1, new Comparator<T>() {

			@Override
			public int compare(T o1, T o2) {
				return o1.compareTo(o2);
			}
		});
	}

	@Override
	public <T> void sort(T[] elements, Comparator<? super T> comparator) {
		quickSort(elements, 0, elements.length - 1, comparator);
	}

}
