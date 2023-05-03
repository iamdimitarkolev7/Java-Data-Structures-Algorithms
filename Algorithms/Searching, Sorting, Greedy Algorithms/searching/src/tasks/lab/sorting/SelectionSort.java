package tasks.lab.sorting;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(5, 7, 1, 3, 2));

        System.out.println(list);
        selectionSort(list);
        System.out.println(list);
    }

    public static void selectionSort(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            int minIndex = i;

            for (int j = minIndex; j < list.size(); j++) {
                if (list.get(minIndex) > list.get(j)) {
                    minIndex = j;
                }
            }

            int el = list.get(i);
            list.set(i, list.get(minIndex));
            list.set(minIndex, el);
        }
    }
}
