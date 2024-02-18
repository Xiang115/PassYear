/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2023_1;

/**
 *
 * @author Goh
 */
import java.util.Random;

public class Q1 {
    public static void main(String[] args) {
        Random r = new Random();
        final int MAX = 1000;
        
        int num = r.nextInt(MAX+1);
        System.out.println("Generared number: " + num);
        
        String num1 = String.valueOf(num);
        String reverse = "";
        for(int i=num1.length()-1; i>=0;i--){
            reverse += (char)num1.charAt(i);
        }
        
        System.out.println("Number in reverse order: " + reverse);
        System.out.println("The sum of all integers: " + reverse.length());
    }
}
