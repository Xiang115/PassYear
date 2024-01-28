/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        final int MAX = 9999;
        System.out.print("Enter the number of random integer: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        
        for(int i=0;i<size;i++){
            num[i] = r.nextInt(MAX)+1;
        }
        
        System.out.print("The random integer : ");
        Display(num);
        System.out.printf("Manimum Number: %d\n",Minimum(num));
        System.out.print("The approximation of the integer to the nearest hundred : ");
        Approximation(num);
        System.out.print("The random integer in reverse order: ");
        Reverse(num);
    }
    
    public static void Display(int[] num){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println("");
    }
    
    public static int Minimum(int[] num){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]<min)
                min = num[i];
        }
        return min;
    }
    
    public static void Approximation(int[] num){
        for(int i=0;i<num.length;i++){
            if(num[i]%100<=50){
                System.out.print(num[i]/100*100+" ");
            }else{
                System.out.print(((num[i]/100)+1)*100+" ");
            }
        }
        System.out.println("");
    }
    
    public static void Reverse(int[] num){
        for(int i=0;i<num.length;i++){
            int a = num[i];
            while(a>0){
                System.out.print(a%10);
                a/=10;
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
