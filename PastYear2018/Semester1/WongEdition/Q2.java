/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear2018.Semester1.WongEdition;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.print("Enter N number: ");
        int N=sc.nextInt();
        int[] sets=new int[N];
        int AAA=0,AA=0,A=0;
        System.out.print("The random numbers are: ");
        for(int i=0;i<sets.length;i++){
            sets[i]=r.nextInt(101)+50;
            System.out.print(sets[i]+" ");
        }
        
        for(int j=0;j<sets.length;j++){
            if(sets[j]%10<=3)
                AAA++;
            else if(sets[j]%10>3 && sets[j]%10<=6)
                AA++;
            else if(sets[j]%10>6)
                A++;
        }
        System.out.println();
        System.out.println("Group AAA: "+AAA);
        System.out.println("Group AA: "+AA);
        System.out.println("Group A: "+A);
    }
}
