package tasks.exercises;

import java.util.Stack;

public class HanoiTowers {

    public static void main(String[] args) {

        int numOfDiscs = 3;
        Stack<Integer> A = new Stack<>();

        while (numOfDiscs > 0) {
            A.push(numOfDiscs--);
        }

        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();

        //playHanoi(3, 'A', 'C', 'B', A, B, C);

        int n = 3;
        towerOfHanoi(n, 'A', 'C', 'B');
    }

    public static void playHanoi(int numOfDisc, char from, char to, char temp,
                                 Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) {

        if (numOfDisc == 1) {
            System.out.println("Move disc " + numOfDisc + " from " + from + " to " + to);
            transferDiscHanoi(from, to, A, B, C);
            return;
        }

        playHanoi(numOfDisc - 1, from, temp, to, A, B, C);
        System.out.println("Move disc " + numOfDisc + " from " + from + " to " + to);
        transferDiscHanoi(from, to, A, B, C);
        playHanoi(numOfDisc - 1, temp, to, from, A, B, C);
    }

    public static void transferDiscHanoi(char from, char to, Stack<Integer> A, Stack<Integer> B, Stack<Integer> C) {

        switch (from) {
            case 'A': {
                if (to == 'B') {
                    B.push(A.pop());
                }
                else if (to == 'C') {
                    C.push(A.pop());
                }
            }
            break;
            case 'B': {
                if (to == 'A') {
                    A.push(B.pop());
                }
                else if (to == 'C') {
                    C.push(B.pop());
                }
            }
            break;
            case 'C': {
                if (to == 'A') {
                    A.push(C.pop());
                }
                else if (to == 'B') {
                    B.push(C.pop());
                }
            }
            break;
            default:
                break;
        }
    }

    // Second similar solution without using stack
    public static void towerOfHanoi(int n, char source, char destination, char auxiliary) {

        if (n == 1) {
            System.out.println("Move disc " + n + " from " + source + " to " + destination);
            return;
        }

        towerOfHanoi(n - 1, source, auxiliary, destination);
        System.out.println("Move disc " + n + " from " + source + " to " + destination);
        towerOfHanoi(n - 1, auxiliary, destination, source);
    }

}
