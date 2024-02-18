/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassYear2022;

/**
 *
 * @author Goh
 */
import java.util.*;
import java.io.*;

public class Q2 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(new FileInputStream("diving.txt"));
            int n = 0;
            while (sc.hasNextLine()) {
                n++;
                sc.nextLine();
            }
            sc.close();

            int size = n / 5;
            Diving[] divers = new Diving[size];

            sc = new Scanner(new FileInputStream("diving.txt"));
            for (int i = 0; i < divers.length; i++) {
                String name = sc.nextLine();
                String country = sc.nextLine();
                double[][] scores = new double[3][7];
                double[] difficulty = new double[3];
                
                for (int x = 0; x < scores.length; x++) {
                    for (int j = 0; j < scores[x].length; j++) {
                        scores[x][j] = sc.nextDouble();
                    }
                    difficulty[x] = sc.nextDouble();
                }
                divers[i] = new Diving(name, country, scores, difficulty);
                if (i != divers.length - 1) {
                    sc.nextLine();
                }
            }
            sc.close();

            for (Diving diver : divers) {
                System.out.println(diver);
                System.out.println("");
            }
            
            //Bubble sort
            for(int pass=1;pass<divers.length;pass++){
                for(int i=0; i<divers.length-1;i++){
                    if(divers[i].getFinal()<divers[i+1].getFinal()){
                        Diving tmp = divers[i];
                        divers[i] = divers[i+1];
                        divers[i+1] = tmp;
                    }
                }
            }
            
            System.out.printf("Gold : %s (%s)\n",divers[0].getName(),divers[0].getCountry()); 
            System.out.printf("Silver : %s (%s)\n",divers[1].getName(),divers[1].getCountry()); 
            System.out.printf("Bronze : %s (%s)\n",divers[2].getName(),divers[2].getCountry()); 

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
