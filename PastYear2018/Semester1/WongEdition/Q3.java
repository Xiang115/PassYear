/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear2018.Semester1.WongEdition;
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter font size: ");
        int a=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter font type: ");
        char input=sc.nextLine().charAt(0);
        System.out.print("Enter format [1 - Vertical, 2 - Horizontal]: ");
        int b=sc.nextInt();
        print(a,input,b);
    }
    
    public static void print(int a, char input, int b){
        if(b==1){
            for(int i=0;i<3+2*a;i++){
                if((i+1)%(a+1)==1){
                    for(int j=0;j<a+2;j++){
                        System.out.print(input);
                    }
                }
                else{
                    for(int k=0;k<a+2;k++){
                        System.out.print(input);
                        int r=k;
                        while(k<r+a){
                            System.out.print(" ");
                            k++;
                        }
                    }
                }
                System.out.println();
            }
        }
        if(b==2){
            for(int i=0;i<2+a;i++){
                if((i+1)%(a+1)==1){
                    for(int j=0;j<2*a+3;j++){
                        System.out.print(input);
                    }
                }
                else{
                    for(int k=0;k<2*a+3;k++){
                        System.out.print(input);
                        int r=k;
                        while(k<r+a){
                            System.out.print(" ");
                            k++;
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
