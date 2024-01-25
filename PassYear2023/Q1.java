/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PYQ2022_1;
import java.util.Random;
/**
 *
 * @author HP
 */
public class Q1 {
    public static void main(String[] args) {
        Random r=new Random();
        int a=r.nextInt(10000)+1;
        System.out.println("Generated number: "+a);
        String reversea=reverse(a);
        System.out.println("Number in reverse order: "+reversea);
        int sum=getSum(a);
        System.out.println("The sum of all integers: "+sum);
    }
    
    private static String reverse(int c){
        String getC=Integer.toString(c);
        String rev="";
        for(int i=getC.length()-1;i>=0;i--){
            rev+=getC.charAt(i);
        }
        return rev;
    }
    
    private static int getSum(int c){
        int[] Cs=new int[5];
        int getsum=0;
        for(int j=0;j<Cs.length;j++){
            Cs[j]=c%10;
            c/=10;
            getsum+=Cs[j];
        }
        return getsum;
    }
}
