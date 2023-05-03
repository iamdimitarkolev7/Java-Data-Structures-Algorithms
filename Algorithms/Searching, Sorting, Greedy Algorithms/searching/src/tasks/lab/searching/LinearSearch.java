package tasks.lab.searching;

import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(3, 5, 4, 6, 7, 8));

        System.out.println(linearSearch(list, 5));
        System.out.println(linearSearch(list, 200));
    }

    public static int linearSearch(List<Integer> list, int el) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == el) {
                return i;
            }
        }

        return -1;
    }
}
