package PastYear2016.Semester2;

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
        System.out.println();
        checkRow(board);
        checkColumn(board);
        checkDiagonal(board);
    }

    public static void checkRow(int[][] board){
        for(int i=0,x=1;i<board.length;i++,x++){
            boolean tf = true;
            for(int j=0;j<board[i].length-1;j++){
                if(board[i][j]!=board[i][j+1]){
                    tf = false;
                    break;
                }
            }
            if(tf){
                if(board[i][0]==0){
                    System.out.println("All 0s on row " + x);
                }else{
                    System.out.println("All 1s on row " + x);
                }
            }
        }
    }

    public static void checkColumn(int[][] board){
        for(int i=0,x=1;i<board.length;i++,x++){
            boolean tf = true;
            for(int j=0;j<board[i].length-1;j++){
                if(board[j][i]!=board[j+1][i]){
                    tf = false;
                    break;
                }
            }
            if(tf){
                if(board[0][i]==0){
                    System.out.println("All 0s on column " + x);
                }else{
                    System.out.println("All 1s on column " + x);
                }
            }
        }
    }

    public static void checkDiagonal(int[][] board){
        boolean tfLeft = true,tfRight = true;
        for(int i=0;i<board.length-1;i++){
            for(int j=0;j<board[i].length-1;j++){
                if(i==j){
                    if(board[i][j]!=board[i+1][j+1]){
                        tfLeft = false;
                    }
                }
            }
            
            int z = board.length-1-i;
                if(board[i][z]!=board[i+1][z-1]){
                    tfRight = false;
                }
            }
        
        if(tfLeft || tfRight){
            if(board[0][0]==0 || board[0][2]==0){
                System.out.println("All 0s on diagonal");
            }else{
                System.out.println("All 1s on diagonal");
            }
        }
    }
}
