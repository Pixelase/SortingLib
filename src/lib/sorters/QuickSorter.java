package lib.sorters;

import java.util.Comparator;

public class QuickSorter implements Sorter {

	private <T extends Comparable<? super T>> void qsort(T[] elements, int a,
			int b) {
		if (a < b) {
			int i = a, j = b;
			T x = elements[(i + j) / 2];

			do {
				while (elements[i].compareTo(x) < 0)
					i++;
				while (x.compareTo(elements[j]) < 0)
					j--;

				if (i <= j) {
					T tmp = elements[i];
					elements[i] = elements[j];
					elements[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);

			qsort(elements, a, j);
			qsort(elements, i, b);
		}
	}

	private <T extends Comparable<? super T>> void qsort(T[] elements, int a,
			int b, Comparator<? super T> comparator) {
		if (a < b) {
			int i = a, j = b;
			T x = elements[(i + j) / 2];

			do {
				while (elements[i].compareTo(x) < 0)
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

			qsort(elements, a, j);
			qsort(elements, i, b);
		}
	}

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements) {
		qsort(elements, 0, elements.length - 1);
	}

	@Override
	public <T extends Comparable<? super T>> void sort(T[] elements,
			Comparator<? super T> comparator) {
		qsort(elements, 0, elements.length - 1, comparator);

	}

}
