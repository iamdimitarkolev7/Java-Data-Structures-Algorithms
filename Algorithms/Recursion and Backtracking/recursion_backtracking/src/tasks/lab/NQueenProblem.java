package tasks.lab;

import java.util.Arrays;

public class NQueenProblem {

    public static void solveNQueen(int n) {
        int[][] board = generateBoard(n);

        solveNQueenUtil(board, 0);
    }

    public static void solveNQueenUtil(int[][] board, int col) {

        if (board.length == col) {
            printBoard(board);
        }

        for (int i = 0; i < board.length; i++) {

            if (isSafe(i, col, board)) {
                board[i][col] = 1;
                solveNQueenUtil(board, col + 1);
                board[i][col] = 0;
            }
        }
    }

    public static int[][] generateBoard(int n) {
        int[][] board = new int[n][n];

        for (int i = 0; i < n; i++) {
            int[] row = new int[n];
            Arrays.fill(row, 0);
            board[i] = row;
        }

        return board;
    }

    public static boolean isSafe(int row, int col, int[][] board) {

        int n = board.length;

        int i, j;

        // Row
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        // Upper left diagonal
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Lower left diagonal
        for (i = row, j = col; j >= 0 && i < n; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    public static void printBoard(int[][] board) {

        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        solveNQueen(4);
    }
}
