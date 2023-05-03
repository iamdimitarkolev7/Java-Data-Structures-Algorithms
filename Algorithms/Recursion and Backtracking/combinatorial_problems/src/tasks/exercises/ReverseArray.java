package tasks.exercises;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));

        reverse(list);
    }

    public static void reverse(List<Integer> list) {
        helper(list, 0, list.size() - 1);
    }

    public static void helper(List<Integer> list, int start, int end) {

        if (start >= end) {
            System.out.println(list);
            return;
        }

        int el = list.get(start);
        list.set(start, list.get(end));
        list.set(end, el);
        helper(list, start + 1, end - 1);
    }
}
