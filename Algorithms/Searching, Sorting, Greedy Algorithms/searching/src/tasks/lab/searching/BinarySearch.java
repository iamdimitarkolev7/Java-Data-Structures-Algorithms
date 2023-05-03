package tasks.lab.searching;

import java.util.ArrayList;
import java.util.List;

public class BinarySearch {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(binarySearch(list, 5, 0, list.size() - 1));
        System.out.println(binarySearch(list, 6, 0, list.size() - 1));
    }

    public static int binarySearch(List<Integer> list, int el, int start, int end) {

        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (list.get(middle) < el) {
            return binarySearch(list, el, middle + 1, end);
        }
        else if (list.get(middle) > el) {
            return binarySearch(list, el, start, middle - 1);
        }
        else {
            return middle;
        }
    }
}
