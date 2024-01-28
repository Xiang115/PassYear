/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PYQ2019_Q1;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program shows the number of odd and even number from 10 random numbers. The random numbers "
                + "must be from 0 - 100.");
        int num, odd=0, even=0;
        Random r=new Random(); //Error 1
        for(int i=1; i<=10;i++){ //Error 2
            num=r.nextInt(101); //Error 3
            System.out.print(num+" ");
            if(isEven(num)){
                ++even; //Error 4
            }
            else{
                ++odd;  //Error 5
            }
        }
        System.out.println("\nNumber of odd number: "+odd);
        System.out.println("Number of even number: "+even);
    }
    
    public static boolean isEven(int a){   //Error 6
        if(a%2==1){ //Error 7
            return false;   //Error 8
        }
        else
            return true;    //Error 9
    }
}
