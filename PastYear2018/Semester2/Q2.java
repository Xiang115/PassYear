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

public class Q2 {
    static final double PriceKg = 5.99;
    static final double tax = 7.25;
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers of bags sold : ");
        int n = sc.nextInt();
        System.out.print("Enter the weight per bag (kilogram) : ");
        double weight = sc.nextDouble();
        
        System.out.println("\nPrice per kilogram: \t$"+ PriceKg);
        System.out.println("Sales tax: \t\t" + tax + "%");
        System.out.printf("Total price after tax: \t$%.2f\n",FindTotal(n,weight));
    }
    
    public static double FindTotal(int n, double weight){
        return n*weight*PriceKg*1.0725;
    }
}
