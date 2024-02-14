/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PastYear2018.Semester1.WongEdition;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);   //Error 1
        int num=0, sum=0;   //Error 2
        do{
            System.out.print("Enter an integer number, -1 to quit:");
            num=a.nextInt();    //Error 3
            if(num==-1) //Error 4
                break;  //Error 5
            if(num%2==0)//Error 6
                System.out.println("The number is an even number.");
            else
                System.out.println("The number is an odd number.");
            sum+=num;   //Error 7
        }while(num!=-1);    //Error 8
        System.out.printf("The sum of all integer number(s) is: %5d\n",sum); //Error 9
    }
    
}
