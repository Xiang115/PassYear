/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_2;

/**
 *
 * @author Goh
 */
import java.util.Random;

public class Q5 {

    public static void main(String[] args) {
        Random r = new Random();
        final int MAX = 2;
        int[][] board = new int[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = r.nextInt(MAX);
            }
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println("");
        }
        checkRow(board);
        checkColumn(board);
        checkDiagonal(board);
    }

    public static void checkRow(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int a = board[i][0];
            int b = board[i][1];
            int c = board[i][2];

            if (a + b + c == 0) {
                System.out.println("All 0s on row " + (i + 1));
            }
            if (a + b + c == 3) {
                System.out.println("All 1s on row " + (i + 1));
            }
        }
    }

    public static void checkColumn(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            int a = board[0][i];
            int b = board[1][i];
            int c = board[2][i];

            if (a + b + c == 0) {
                System.out.println("All 0s on column " + (i + 1));
            }
            if (a + b + c == 3) {
                System.out.println("All 1s on column " + (i + 1));
            }
        }
    }

    public static void checkDiagonal(int[][] board) {
            int a = board[0][0];
            int b = board[1][1];
            int c = board[2][2];

            if (a + b + c == 0) {
                System.out.println("All 0s on diagonal");
            }
            if (a + b + c == 3) {
                System.out.println("All 1s on diagonal");
            }
    }
}
