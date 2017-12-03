package sorting;

import java.io.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestSorting {
    public static void main(String[] args) throws IOException {

        @SuppressWarnings("rawtype")
        List<Integer> list = new ArrayList();
        Scanner scanner = new Scanner(new File("D:/work/algs4-data/1Mints.txt")); //D:/work/algs4-data/4Kints.txt
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        scanner.close();

        Integer[] array = list.toArray(new Integer[0]);

        new Timer();

//        SelectionSort.sort(array);

        Arrays.sort(array);

        int counter = 0;
        for (int x : array) {
            if (counter == 100) {
                System.out.println();
                counter = 0;
            }
            System.out.print(x + " ");
            counter++;
        }


        Timer.setIsDone(true);

        FileWriter writer = new FileWriter("D:/work/sortOutput.txt", false);
        System.out.println("DoWrite");
        for (Integer anArray : array) {
            writer.write(anArray.toString());
            writer.write(System.lineSeparator());
        }
        writer.close();
        System.out.println("Done");
    }
}
