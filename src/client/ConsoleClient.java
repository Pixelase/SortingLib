package client;

import java.util.Random;

import lib.sorters.InsertionSorter;
import lib.sorters.QuickSorter;
import lib.sorters.ShellSorter;
import lib.utils.SorterManager;

public class ConsoleClient {

	public static Integer[] generateArray(int size, int bound) {
		Integer[] numbers = new Integer[size];
		Random rand = new Random();

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(bound);
		}

		return numbers;
	}

	public static <T> void printArray(T[] array) {
		for (T element : array) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {

		Integer[] a1 = generateArray(10, 600);
		Integer[] a2 = a1.clone();
		Integer[] a3 = a1.clone();

		System.out
				.println("---- Demonstration that the algorithms are working correctly ----");

		System.out.println("\n> Original array: ");
		printArray(a1);

		System.out.println("\n> Insertion sorting:");
		long insertionSortTime = SorterManager.getSortingTime(a1,
				new InsertionSorter());
		printArray(a1);

		System.out.println("\n> Quick sorting:");
		long quickSortTime = SorterManager
				.getSortingTime(a2, new QuickSorter());
		printArray(a2);

		System.out.println("\n> Shell sorting:");
		long shellSortTime = SorterManager
				.getSortingTime(a3, new ShellSorter());
		printArray(a3);

		System.out
				.println("\n=================================================================\n\n"
						+ "Time of Insertion sorting is "
						+ insertionSortTime
						+ " nanoseconds."
						+ "\n"
						+ "Time of \"Quick\" sorting is "
						+ quickSortTime
						+ " nanoseconds."
						+ "\n"
						+ "Time of Shell sorting is "
						+ shellSortTime
						+ " nanoseconds."
						+ "\n"
						+ "\n=================================================================");

	}
}
