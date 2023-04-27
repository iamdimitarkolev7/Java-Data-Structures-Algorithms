package tasks.lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class LabyrinthPath {

    private static List<List<Character>> map = new ArrayList<>();
    private static Stack<Character> trace = new Stack<>();

    public static void findPath(int row, int col, char direction) {

        if (!isInBounds(row, col)) {
            return;
        }

        trace.push(direction);

        if (isExit(row, col)) {
            printPath();
            System.out.println();
        }
        else if (!isVisited(row, col) && isPassable(row, col)) {
            mark(row, col);

            findPath(row + 1, col, 'D'); // Down
            findPath(row - 1, col, 'U'); // Up
            findPath(row, col + 1, 'R'); // Right
            findPath(row, col - 1, 'L'); // Left

            unmark(row, col);
        }

        trace.pop();
    }

    private static boolean isInBounds(int row, int col) {

        if (map.size() == 0) {
            return false;
        }

        return row >= 0 && row < map.size() &&
                col >= 0 && col < map.get(row).size();
    }

    private static boolean isExit(int row, int col) {

        if (map.size() == 0) {
            return false;
        }

        return row == map.size() - 1 &&
                col == map.get(row).size() - 1;
    }

    private static boolean isVisited(int row, int col) {
        return map.get(row).get(col) == '0';
    }

    private static boolean isPassable(int row, int col) {
        return map.get(row).get(col) != '*';
    }

    private static void mark(int row, int col) {
        map.get(row).set(col, '0');
    }

    private static void unmark(int row, int col) {
        map.get(row).set(col, '-');
    }

    private static void printPath() {
        trace.forEach(System.out::print);
    }

    public static void main(String[] args) {
        map.add(new ArrayList<>() {{ add('-'); add('-'); add('-'); add('*'); add('-'); add('-'); add('-');}});
        map.add(new ArrayList<>() {{ add('*'); add('*'); add('-'); add('*'); add('-'); add('*'); add('-');}});
        map.add(new ArrayList<>() {{ add('-'); add('-'); add('-'); add('-'); add('-'); add('-'); add('-');}});
        map.add(new ArrayList<>() {{ add('-'); add('*'); add('*'); add('*'); add('*'); add('*'); add('-');}});
        map.add(new ArrayList<>() {{ add('-'); add('-'); add('-'); add('-'); add('-'); add('-'); add('-');}});

        findPath(0, 0, ' ');
    }
}
