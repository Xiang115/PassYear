/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2019_Q3;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter genome string [quit to stop] : ");
            String get=sc.nextLine();
            if(get.equals("quit")){
                break;
            }
            if(qualified(get)){
                check(get);
            }
            else
                System.out.println("No gene is found");
        }
    }

    static boolean qualified(String get){
        char[]input=new char[get.length()];
        for(int i=0;i<get.length();i++){
            input[i]=get.charAt(i);
        }
        if(input.length%3!=0)
            return false;
        for(int j=0;j<input.length;j+=3){
            if(input[j]=='A' && input[j+1]=='T' && input[j+2]=='G'){
                j+=3;
                if(input.length-j==3 && (input[j]=='T' && input[j+1]=='A' && input[j+2]=='G'||input[j]=='T' && input[j+1]=='A' && input[j+2]=='A'
                   ||input[j]=='T' && input[j+1]=='G' && input[j+2]=='A')){
                        return false;
                    }
                for(int k=j;k<input.length-2;k++){
                if(!(input[j]=='T' && input[j+1]=='A' && input[j+2]=='G'||input[j]=='T' && input[j+1]=='A' && input[j+2]=='A'
                   ||input[j]=='T' && input[j+1]=='G' && input[j+2]=='A')){
                    return false;
                }    
                }
            }
            if(input[j]=='T' && input[j+1]=='A' && input[j+2]=='G')
                return false;
            if(input[j]=='T' && input[j+1]=='A' && input[j+2]=='A')
                return false;
            if(input[j]=='T' && input[j+1]=='G' && input[j+2]=='A')
                return false;
        }
        return true;
    }
    
    private static void check(String get){
        char[]input=new char[get.length()];
        for(int i=0;i<get.length();i++){
            input[i]=get.charAt(i);
        }
        for(int i=0;i<get.length()-2;i++){
            if(input[i]=='A' && input[i+1]=='T' && input[i+2]=='G'){
                for(int j=i+3;j<get.length();j++){
                    if((input[j]=='T' && input[j+1]=='A' && input[j+2]=='G')||(input[j]=='T' && input[j+1]=='A' && input[j+2]=='A')
                        ||(input[j]=='T' && input[j+1]=='G' && input[j+2]=='A')){
                        System.out.println();
                        break;
                    }
                    if(input[j]=='A' && input[j+1]=='T' && input[j+2]=='G'){
                        j+=2;
                        break;
                    }
                    System.out.print(input[j]);
                }
            }
        }
    }
}
