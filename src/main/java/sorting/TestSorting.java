package sorting;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestSorting {
    public static void main(String[] args) throws IOException {

        @SuppressWarnings("rowtype")
        List<Integer> list = new ArrayList();
        Scanner scanner = new Scanner(new File("path_to_test_file_input/1Kints.txt")); //D:/work/algs4-data/4Kints.txt
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        Integer[] array = list.toArray(new Integer[0]);

        InsertionSort.sort(array);

        FileWriter writer = new FileWriter("path_to_test_file_output_result.txt", false);
        System.out.println("DoWrite");
        for (Integer anArray : array) {
            writer.write(anArray.toString());
            writer.write(System.lineSeparator());
        }
        writer.close();
        System.out.println("Done");
    }
}
