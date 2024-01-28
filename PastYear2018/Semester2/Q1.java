/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2018_2;

/**
 *
 * @author Goh
 */
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        int[] num = {69, 15, 12, 27, 74, 23};
        int cnt = 0;
        for (int i = 0; i < num.length; i++) {
            if (isOdd(num[i])) {
                cnt++;
            }
        }
        System.out.println("The number of odd number is " + cnt);
        System.out.println("The sum of the array is " + compSum(num));
    }

    public static boolean isOdd(int a) {
        if(a%2==0){
            return false;
        }else
            return true;
    }

    public static int compSum(int[] a) { 
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }
}// end class
