package tasks.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedLoopsToRecursion {

    public static void main(String[] args) {

        int n = 3;
        int[] arr = new int[n];

        generateSolution(n, arr, 0);
    }

    public static void generateSolution(int n, int[] arr, int level) {

        if (level == n) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[level] = i;
            generateSolution(n, arr, level + 1);
        }
    }
}
