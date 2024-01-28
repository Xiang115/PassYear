/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PYQ2020_Q1;
import java.util.Scanner;
//Filename:Q1.java
public class Q1 {
    public static void main(String[] args) {
        System.out.println("This program changes all the odd numbers in the array into even numbers.");
        Scanner s=new Scanner(System.in);//Error 1
        int size=5;
        int[] num=new int[size];//Error 2
        System.out.print("Enter five integer numbers : ");
        for(int i=0;i<size;i++){ //Error 3
            num[i]=s.nextInt();//Error 4
        }
        convert(num);//Error 5
        System.out.print("The numbers are : ");
        for(int i=0;i<size;i++){
            System.out.print(num[i]+" ");//Error 6
    }
        System.out.println();
}

    public static void convert(int[] a){//Error 7
        for(int i=0;i<a.length;i++){//Error 8
            if(a[i]%2==1)//Error 9
                a[i]+=1;//Error 10
        }
    }
}