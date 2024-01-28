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

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e,f;
        System.out.print("Enter the value for a,b,c,d,e and f : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        LinearEquation r1 = new LinearEquation(a,b,c,d,e,f);
        
        System.out.println("\nThe equation: ");
        System.out.println(r1);
        System.out.printf("\nx = %d ; y = %d\n",r1.computeX(),r1.computeY());
    }
}
