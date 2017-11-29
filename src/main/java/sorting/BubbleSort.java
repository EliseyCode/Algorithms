package sorting;

public final class BubbleSort {

    /**
     * @param array array to be sorted
     * @param <T>   Object that can be compared with another object
     */

    public static <T extends Comparable<? super T>> void sortVariationOne(T[] array) {
        boolean swapped;
        do {
            swapped = false;

            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    swap(array, i - 1, i);
                    swapped = true;
                }
            }
        }
        while (swapped);
    }

    /**
     * @param array array to be sorted
     * @param <T>   Object that can be compared with another object
     */

    public static <T extends Comparable<? super T>> void sortVariationTwo(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[i].compareTo(array[j]) > 0) {
                    swap(array, i, j);
                }
            }
        }
    }

    /**
     * @param arrays array to be sorted
     * @param left   left element of array to be changed with right element
     * @param right  right element of array to be changed with left element
     * @param <T>    Object that can be compared with another object
     */

    private static <T> void swap(T[] arrays, int left, int right) {
        if (left != right) {
            T temp = arrays[left];
            arrays[left] = arrays[right];
            arrays[right] = temp;
        }
    }

    private BubbleSort() {
    }
}
