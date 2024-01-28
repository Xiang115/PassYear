/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_2;

/**
 *
 * @author Goh
 */
import java.util.*; //9.47

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pound = sc.nextDouble();
        
        double kg = pound*0.454;
        System.out.println(pound+ " pounds is " + kg + " kilograms");
    }
}
