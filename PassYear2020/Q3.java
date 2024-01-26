/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
import java.util.*;
import java.io.*;

public class Q3 {
    static int Cnt2=0,Cnt4=0,Cnt6=0,Cnt8=0,Cnt10=0;
    
    public static void main(String[] args) {
        Random r = new Random();
        int min = 2, max = 10;
        try{
            PrintWriter output = new PrintWriter(new FileOutputStream("raw.txt"));
            for(int i=0;i<50;i++){
                output.print(r.nextInt(max-min+1)+min + " ");
            }
            output.close();
        }catch(IOException e){
            System.out.println("Problem with input ");
        }
        
        try{
            BufferedReader input = new BufferedReader(new FileReader("raw.txt"));
            String[] num = input.readLine().split(" ");
            CountFrequency(num);
            System.out.printf("2 : %d\n",Cnt2);
            System.out.printf("4 : %d\n",Cnt4);
            System.out.printf("6 : %d\n",Cnt6);
            System.out.printf("8 : %d\n",Cnt8);
            System.out.printf("10 : %d\n",Cnt10);
            int[] A = {Cnt2,Cnt4,Cnt6,Cnt8,Cnt10};
            System.out.printf("The mode of the dataset is : %d\n",FindMode(A));
            
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Problem with input");
        }      
    }
    
    public static void CountFrequency(String[] num){
        for (String num1 : num) {
            int n = Integer.parseInt(num1);
            if(n==2){
                Cnt2++;
            }
            if(n==4){
                Cnt4++;
            }
            if(n==6){
                Cnt6++;
            }
            if(n==8){
                Cnt8++;
            }
            if(n==10){
                Cnt10++;
            }
        }
    }
    
    public static int FindMode(int[] A){
        int mode = A[0];
        int x=0;
        for(int i=0;i<A.length-1;i++){
            if(mode<A[i]){
                mode = A[i];
                x=i;
            }
        }  
        return (x*2+2);
    }
}
