/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_1;

/**
 *
 * @author Goh
 */

import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Fee,YearIncrement;
        double rate;
        
        System.out.print("Enter the initial tuition fee(i.e.year 1): ");
        Fee = sc.nextInt();
        System.out.print("Enter the yearly rate of increment(e.g enter 5.2 for 5.2%): ");
        rate = sc.nextDouble();
        System.out.print("Enter the year for which you wish to compute the tuition fee for: ");
        YearIncrement = sc.nextInt();
        
        System.out.printf("Computed tuition fee for year %d is: %.2f\n",YearIncrement,computeFee(Fee,YearIncrement,rate));
    }
    
    public static double computeFee(int InitialFee,int Year,double rate){
        double TotalFee= InitialFee;
        for(int i=1;i<Year;i++){
            TotalFee += TotalFee*(double)(rate/100); 
        }
        return TotalFee;
    }
}
