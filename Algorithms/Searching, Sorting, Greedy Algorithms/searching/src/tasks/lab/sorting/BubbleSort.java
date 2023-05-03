package tasks.lab.sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 7, 1, 3, 2));

        System.out.println(list);
        bubbleSort(list);
        System.out.println(list);
    }

    public static void bubbleSort(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) {

            for (int j = 0; j < list.size() - 1; j++) {

                if (list.get(j) > list.get(j + 1)) {
                    int el = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, el);
                }
            }
        }
    }
}
