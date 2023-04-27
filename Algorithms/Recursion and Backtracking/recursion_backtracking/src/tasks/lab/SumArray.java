package tasks.lab;

import java.util.List;

public class SumArray {

    public static int sumArray(List<Integer> arr) {

        if (arr.size() == 0) {
            return 0;
        }

        int lastIndex = arr.size() - 1;

        return arr.get(lastIndex) + sumArray(arr.subList(0, lastIndex));
    }

    public static void main(String[] args) {

        System.out.println(sumArray(List.of(1, 2, 3))); // 6
        System.out.println(sumArray(List.of(1, 2, 3, 4, 5))); // 15

    }
}
