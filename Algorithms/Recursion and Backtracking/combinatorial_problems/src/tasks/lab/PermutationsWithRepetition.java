package tasks.lab;

import java.util.ArrayList;
import java.util.List;

public class PermutationsWithRepetition<T> {

    public static void main(String[] args) {

        PermutationsWithRepetition<Character> solution = new PermutationsWithRepetition<>();

        List<Character> list = new ArrayList<>(List.of('A', 'B', 'B'));
        List<List<Character>> combinations = new ArrayList<>();
        solution.permute(list, combinations, 0);
    }

    public void permute(List<T> list, List<List<T>> combinations, int start) {

        if (start >= list.size()) {
            if (!isAlreadyPresented(combinations, list)) {
                System.out.println(list);
                combinations.add(List.copyOf(list));
            }

            return;
        }

        for (int i = start; i < list.size(); i++) {
            swap(list, start, i);
            permute(list, combinations, start + 1);
            swap(list, start, i);
        }
    }

    public void swap(List<T> list, int i, int j) {
        T temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public boolean isAlreadyPresented(List<List<T>> combinations, List<T> list) {

        for (List<T> l : combinations) {
            if (l.equals(list)) {
                return true;
            }
        }

        return false;
    }
}
