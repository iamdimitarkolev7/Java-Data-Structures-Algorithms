package tasks.lab;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithoutRepetition<T> {

    public static void main(String[] args) {
        PermutationsWithoutRepetition<Character> solution = new PermutationsWithoutRepetition<>();

        List<Character> list = new ArrayList<>(List.of('A', 'B', 'B'));
        solution.permute(list, 0);
    }

    public void permute(List<T> list, int start) {

        if (start >= list.size()) {
            System.out.println(list);
            return;
        }

        for (int i = start; i < list.size(); i++) {
            swap(list, start, i);
            permute(list, start + 1);
            swap(list, start, i);
        }
    }

    public void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}


