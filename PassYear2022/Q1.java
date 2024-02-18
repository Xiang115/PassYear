/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassYear2022;

/**
 *
 * @author Goh
 */
import java.util.Random;

public class Q1 {

    public static void main(String[] args) {
        Random r = new Random();
        System.out.print("3 random price values: ");
        RandomPrice(r);
        System.out.print("5 random even-numbered years: ");
        RandomEvenYear(r);
        System.out.print("Car Plate Number: ");
        RandomCarPlate(r);
        System.out.print("Random Word : ");
        RandomWord(r);
    }

    public static void RandomPrice(Random r) {
        final double MAX = 300;
        final double MIN = 100;
        double[] Prices = new double[3];
        for (int i = 0; i < Prices.length; i++) {
            Prices[i] = r.nextDouble(MAX - MIN + 1) + MIN;
            System.out.printf("%.2f ", Prices[i]);
        }
        System.out.println("");
    }

    public static void RandomEvenYear(Random r) {
        final int MAX = 2030;
        final int MIN = 1990;
        int[] years = new int[5];
        for (int i = 0; i < years.length; i++) {
            years[i] = r.nextInt(MAX - MIN + 1) + MIN;
            if(years[i]%2==1){
                years[i]++;
            }
            System.out.printf("%d ",years[i]);
        }
        System.out.println("");
    }
    
    public static void RandomCarPlate(Random r){
        String plate = "";
        int num = r.nextInt(99999-10000+1)+10000;
        plate += num;
        final int max = 26;
        for(int i=0;i<2;i++){
            plate += (char)(r.nextInt(max)+'A');
        }
        System.out.print(plate + "\n");
    }
    
    public static void RandomWord(Random r){
        String word = "";
        final int max = 26;
        char[] letter = {'a','A'};
        for(int i=0;i<8;i++){
            word += (char)(r.nextInt(max)+ letter[r.nextInt(2)]);
        }
        System.out.print(word + "\n");
    }
}
