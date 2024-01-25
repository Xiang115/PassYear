/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_2;

/**
 *
 * @author Goh
 */

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();
        
        int  sum = 0;
        if(num > 0 && num < 1000){
            while(num>0){
                sum += num % 10;
                num/=10;
            }
            System.out.println("The sum of the digits is " + sum);
        }else{
            System.out.println("Invalid");
        }
    }
}
