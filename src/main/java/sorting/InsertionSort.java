package sorting;

public final class InsertionSort {
    public static void main(String[] args) {

    }

    public static <T extends Comparable<? super T>> void sort(T[] array) {
        int sortedEndIndex = 1;

        while (sortedEndIndex < array.length) {
            if (array[sortedEndIndex].compareTo(array[sortedEndIndex - 1]) < 0) {
                int indexToInsert = getIndexToInsert(array, array[sortedEndIndex - 1]);
                insert(array, indexToInsert, sortedEndIndex);
            }
        }
    }

    private static <T> void insert(T[] array, int indexToInsert, int sortedEndIndex) {
            throw new UnsupportedOperationException();
    }

    private static <T extends Comparable<? super T>> int getIndexToInsert(T[] array, T t) {
        for (int index = 0; index < array.length; index++) {
            if (array[index].compareTo(t) > 0) {
                return index;
            }
        }
        throw new IllegalArgumentException();
    }

    private InsertionSort() {
    }
}
