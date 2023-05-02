package tasks.lab;

import java.util.ArrayList;
import java.util.List;

public class VariationsWithRepetitions<T> {

    public static void main(String[] args) {
        VariationsWithRepetitions<Character> solution = new VariationsWithRepetitions<>();

        List<Character> list = new ArrayList<>(List.of('A', 'B', 'C'));
        List<Character> variation = new ArrayList<>();

        solution.variate(list, variation, 3);
    }

    public void variate(List<T> list, List<T> variation, int sizeOfVariation) {

        if (list.size() < sizeOfVariation) {
            throw new IllegalArgumentException("Size of variation should be smaller than the elements size");
        }

        if (sizeOfVariation == variation.size()) {
            System.out.println(variation);
            return;
        }

        for (int i = 0; i < list.size(); i++) {
            variation.add(list.get(i));
            variate(list, variation, sizeOfVariation);
            variation.remove(variation.size() - 1);
        }
    }
}
