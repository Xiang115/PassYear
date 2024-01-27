/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q3;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q3 {
    public static void main(String[] args) {
        try{
            Scanner raw=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\raw.txt"));
            int frequency[]=new int [11];
            
            while(raw.hasNextInt()){
                int num=raw.nextInt();
                frequency[num]++;
            }
            
            System.out.println("Frequency distribution table:");
            int max=0,mode=0;
            for(int i=2;i<11;i++){
                if(frequency[i]==0)
                    continue;
                if(max<frequency[i]){
                    max=frequency[i];
                    mode=i;
                }
                System.out.println(i+" : "+frequency[i]);
            }
            System.out.println("The mode of the dataset is : "+mode);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
