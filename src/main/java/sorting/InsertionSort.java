package sorting;

import java.util.NoSuchElementException;

public final class InsertionSort {

    public static <T extends Comparable<? super T>> void sort(T[] array) {
        int currentIndex = 1;

        while (currentIndex < array.length) {
            if (array[currentIndex].compareTo(array[currentIndex - 1]) < 0) {
                int indexToInsert = getIndexToInsert(array, array[currentIndex]);
                insertToArray(array, indexToInsert, currentIndex);
            }
            currentIndex++;
        }
    }

    private static <T> void insertToArray(T[] array, int indexToInsert, int currentIndex) {
        T temp = array[indexToInsert];
        array[indexToInsert] = array[currentIndex];

        for (int index = currentIndex; index > indexToInsert; index--) {
            array[index] = array[index - 1];
        }
        array[indexToInsert + 1] = temp;
    }

    private static <T extends Comparable<? super T>> int getIndexToInsert(T[] array, T element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(element) > 0) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    private InsertionSort() {
    }
}