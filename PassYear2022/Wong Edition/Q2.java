/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2022_Q2;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        try{
            Scanner getdivers=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\diving.txt"));
            int lines=0;
            while(getdivers.hasNextLine()){
                getdivers.nextLine();
                lines++;
            }
            getdivers.close();
            int numofdivers=lines/5;
            
            Diving[] divers=new Diving[numofdivers];
            getdivers=new Scanner(new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\UM\\WIX1002\\diving.txt"));
            for(int i=0;i<numofdivers;i++){
                String name=getdivers.nextLine();
                String country=getdivers.nextLine();
                double[][] scores=new double[3][7];
                double[] ratings=new double[3];
                for(int attempt=0;attempt<3;attempt++){
                    for(int judges=0;judges<7;judges++){
                        scores[attempt][judges]=getdivers.nextDouble();
                    }
                    ratings[attempt]=getdivers.nextDouble();
                }
                divers[i]=new Diving(name,country,scores,ratings);
                if(i!=numofdivers-1)
                    getdivers.nextLine();
            }
            getdivers.close();
            
            for(Diving print: divers){
                System.out.println(print.toString());
                System.out.println();
            }
            
            for(int pass=1;pass<numofdivers;pass++){
                for(int a=0;a<numofdivers-1;a++){
                    if(divers[a].FinalScore()<divers[a+1].FinalScore()){
                        Diving temp=divers[a+1];
                        divers[a+1]=divers[a];
                        divers[a]=temp;
                    }
                }
            }
            
            System.out.printf("Gold : %s (%s)\n",divers[0].getName(),divers[0].getCountry());
            System.out.printf("Silver : %s (%s)\n",divers[1].getName(),divers[1].getCountry());
            System.out.printf("Bronze : %s (%s)\n",divers[2].getName(),divers[2].getCountry());
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
    }
}
