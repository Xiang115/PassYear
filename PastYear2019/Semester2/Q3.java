/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */
import java.util.Scanner;
import java.util.Random;

public class Q3 {
    public static void main(String[] args) {
        final int MAX = 10;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        char choice = 'y';
        while(true){
            if(choice == 'n'){
                break;
            }
            int num1 = r.nextInt(MAX);
            int num2 = r.nextInt(MAX);
            System.out.printf("\nWhat is %d + %d ? ",num1,num2);
            int answer = sc.nextInt();
            if(isTrue(answer,num1,num2)){
                System.out.printf("%d + %d = %d is true\n",num1,num2,answer);
            }else{
                System.out.printf("%d + %d = %d is false\n",num1,num2,answer);
            }
            
            System.out.print("Do you want to try another question (y/n)? : ");
            choice = sc.next().charAt(0);
            System.out.println("");
        }
        System.out.println("Program ends.");
    }
    public static boolean isTrue(int answer,int num1,int num2){
        return answer == (num1+num2);
    }
}
