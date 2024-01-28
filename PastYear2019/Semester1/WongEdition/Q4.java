/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2019_Q4;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author HP
 */
public class Q4 {
    public static void main(String[] args) {
        System.out.println("The essay is : ");
        String essay="";
        int wordcount=0,sentencecount=0,num;
        int[] charac=new int[26];
        
        try{
            Scanner input=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\myAmbition.txt"));
            do{
                String getessay=input.nextLine();
                System.out.println(getessay);
                essay+=getessay;
            }while(input.hasNextLine());
            input.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        
        System.out.println();
        String sentences[]=essay.split("\\.");
        sentencecount=sentences.length;
        System.out.println("Number of sentences : "+sentencecount);
        String[] word=essay.split(" ");
        wordcount=word.length;
        System.out.println("Number of words : "+wordcount);
        
        for(int i=0;i<word.length;i++){
            word[i]=word[i].toUpperCase();
            for(int j=0;j<word[i].length();j++){
                num=(int)word[i].charAt(j)-(int)'A';                
                if(num<0){
                    continue;
                }
                charac[num]++;
            }
        }
        
        for(int l=0;l<charac.length;l++){
            if((l+1)%8==0)
                System.out.println();
            System.out.print((char)(l+(int)'A')+" : "+charac[l]+" ");
        }
        System.out.println();
    }
}
