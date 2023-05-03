package tasks.lab;

import java.util.ArrayList;
import java.util.List;

public class VariationsWithoutRepetitions<T> {

    public static void main(String[] args) {
        VariationsWithoutRepetitions<Character> solution = new VariationsWithoutRepetitions<>();

        List<Character> list = new ArrayList<>(List.of('A', 'B', 'C'));
        List<Character> variation = new ArrayList<>();
        solution.generateVariations(list, variation, 2, new boolean[list.size()]);
    }

    public void generateVariations(List<T> list, List<T> variation, int sizeOfVariation, boolean[] used) {

        if (list.size() < sizeOfVariation) {
            throw new IllegalArgumentException("Size of variation should be smaller than the elements size");
        }

        if (variation.size() == sizeOfVariation) {
            System.out.println(variation);

            return;
        }

        for (int i = 0; i < list.size(); i++) {
            if (!used[i]) {
                used[i] = true;
                variation.add(list.get(i));
                generateVariations(list, variation, sizeOfVariation, used);
                variation.remove(variation.size() - 1);
                used[i] = false;
            }
        }
    }
}
