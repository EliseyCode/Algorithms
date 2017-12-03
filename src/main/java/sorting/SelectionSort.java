package sorting;

public class SelectionSort {

    public static <T extends Comparable<? super T>> void sort(T[] array) {
        int currentIndex = 0;

        while (currentIndex < array.length) {
            int smallestIndex = getNextIndex(array, currentIndex);
            swap(array, currentIndex, smallestIndex);
            currentIndex++;
        }
    }

    private static <T> void swap(T[] array, int indexTo, int indexFrom) {
        if (indexTo != indexFrom) {
            T temp = array[indexTo];
            array[indexTo] = array[indexFrom];
            array[indexFrom] = temp;
        }
    }

    private static <T extends Comparable<? super T>> int getNextIndex(T[] array, int indexToSearchFrom) {
        T smallest = array[indexToSearchFrom];
        int smallestIndex = indexToSearchFrom;

        for (int currentIndex = indexToSearchFrom + 1; currentIndex < array.length; currentIndex++) {
            if (array[currentIndex].compareTo(smallest) < 0) {
                smallest = array[currentIndex];
                smallestIndex = currentIndex;
            }
        }
        return smallestIndex;
    }
}