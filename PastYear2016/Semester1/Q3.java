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

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        final int MAX = 999;
        
        System.out.print("Enter the number of random integer: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        
        for(int i=0;i<num.length;i++){
            num[i] = r.nextInt(MAX+1);
        }
        Display(num);
        Max(num);
        RoundOff(num);
        Inverse(num);
    }
    
    public static void Display(int[] a){
        System.out.print("The random integer : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " ");
        }
        System.out.println("");
    }
    
    public static void Max(int[] a){
        System.out.print("Maximum Number : ");
        int MAX = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>MAX)
                MAX = a[i];
        }
        System.out.println(MAX);
    }
    
    public static void RoundOff(int[] a){
        int[]b = a.clone();
        System.out.print("The approximation of the integer to the nearest tenth : ");
        for(int i=0;i<b.length;i++){
            if(b[i]%10<=4){
                System.out.print(b[i]/10*10+" ");
            }else{
                System.out.print((b[i]/10+1)*10+" ");
            }
        }
        System.out.println("");
    }
    
    public static void Inverse(int[]a){
        int[]c = a.clone();
        System.out.print("The random integer in reverse order: ");
        for(int i=0;i<c.length;i++){
            int num = a[i];
            while(num>0){
                System.out.print(num%10);
                num/=10;
            }
            System.out.print(" ");
        }
        System.out.println("");
    }
}
