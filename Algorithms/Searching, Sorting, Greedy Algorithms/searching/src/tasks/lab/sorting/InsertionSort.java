package tasks.lab.sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(5, 7, 1, 3, 2));

        System.out.println(list);
        insertionSort(list);
        System.out.println(list);
    }

    public static void insertionSort(List<Integer> list) {

        for (int i = 1; i < list.size(); i++) {

            int key = list.get(i);
            int j = i - 1;

            while (j >= 0 && list.get(j) > key) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }

            list.set(j + 1, key);
        }
    }
}
