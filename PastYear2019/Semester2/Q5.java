/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter value for a, b and c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        QuadraticEquation q1 = new QuadraticEquation(a,b,c);
        
        System.out.printf("The equation is : %dx(^2) + (%d)x + (%d)\n",a,b,c);
        System.out.println("Discriminant : " + q1.Discriminant());
        if(q1.Discriminant()>0){
            System.out.printf("The roots : %d and %d\n",q1.calcRoot1(),q1.calcRoot2());
        }else if(q1.Discriminant()<0){
            System.out.println("The equation has no roots");
        }else{
            System.out.printf("Same roots : %d\n",q1.calcRoot1());
        }
    }
}
