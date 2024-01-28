/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_1;

/**
 *
 * @author Goh
 */
import java.util.*;

public class Q2 {

    public static int CntPlayer = 0, CntComputer = 0;
    public static final int[][] game = {
        {0, 0, 1},
        {1, 0, 0},
        {0, 1, 0}
    };
    static String[] item = {"Paper","Scissor","Rock"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        final int MAX = 3;

        while (true) {
            if (CntPlayer == 3 || CntComputer == 3) {
                break;
            }
            System.out.print("Enter 1.Paper 2.Scissor 3.Rock: ");
            int choice = sc.nextInt();
            int computer = r.nextInt(MAX);
            System.out.printf("Player : %s ---- Computer : %s\n",item[choice-1],item[computer]);
            Winner(choice,computer);
        }
        sc.close();
        if (CntPlayer == 3) {
            System.out.println("Player win the game");
        } else {
            System.out.println("Computer win the game");
        }
    }

    public static void Winner(int a, int b) {
        if (game[a-1][b] == 1) {
            CntPlayer++;
            System.out.println("Player win " + CntPlayer + " time(s)");
        } else if (game[b][a - 1] == 1) {
            CntComputer++;
            System.out.println("Computer win " + CntComputer + " time(s)");
        } else {
            System.out.println("They are draw");
        }
    }
}
