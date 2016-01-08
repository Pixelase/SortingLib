package client.examples;

import client.stuff.AnotherComparator;
import client.stuff.WithComparable;
import lib.sorters.InsertionSorter;
import lib.sorters.QuickSorter;
import lib.sorters.ShellSorter;
import lib.utils.SorterManager;

import java.util.Random;

public class ThirdExample {

    public static WithComparable[] generateArray(int size, int bound) {
        WithComparable[] numbers = new WithComparable[size];
        Random rand = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new WithComparable(rand.nextInt(bound));
        }

        return numbers;
    }

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        WithComparable[] a1 = generateArray(10000, 600);
        WithComparable[] a2 = a1.clone();
        WithComparable[] a3 = a1.clone();

        System.out.println(">--- Third example ---<");
        System.out.println("---- Demonstration that the algorithms are working correctly ----");

//        System.out.println("\n> Original array: ");
//        printArray(a1);

//        System.out.println("\n> Insertion sorting:");
        long insertionSortTime = SorterManager.getSortingTime(a1, new InsertionSorter(), new AnotherComparator());
//        printArray(a1);

//        System.out.println("\n> Quick sorting:");
        long quickSortTime = SorterManager.getSortingTime(a2, new QuickSorter(), new AnotherComparator());
//        printArray(a2);

//        System.out.println("\n> Shell sorting:");
        long shellSortTime = SorterManager.getSortingTime(a3, new ShellSorter(), new AnotherComparator());
//        printArray(a3);

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
