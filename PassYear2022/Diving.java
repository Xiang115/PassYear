/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PassYear2022;

import java.util.Arrays;

/**
 *
 * @author Goh
 */
public class Diving {

    private String name;
    private String country;
    private double[][] score;
    private double[] difficulty;

    public Diving() {
        this.name = null;
        this.country = null;
        this.score = new double[3][7];
        this.difficulty = new double[3];
    }
    
    public Diving(String a, String b, double[][] c, double[] d){
        this.name = a;
        this.country = b;
        this.score = c;
        this.difficulty = d;
    }

    public String getName() {
        return this.name;
    }

    public String getCountry() {
        return this.country;
    }

    public double getFinal() {
        double[] sum = new double[3];
        for (int attempt = 0; attempt < score.length; attempt++) {
            Arrays.sort(score[attempt]);
            for (int i = 2; i < score[attempt].length - 2; i++) {
                sum[attempt] += score[attempt][i];
            }
            sum[attempt] *= difficulty[attempt];
        }
        double total = sum[0] + sum[1] + sum[2];
        return total;
    }

    @Override
    public String toString() {
        String str = "Diver : " + this.name + "(" + this.country + ")\n";
        for (int attempt = 0; attempt < score.length; attempt++) {
            str += "Judges Scores : ";
            for(int i=0;i<score[attempt].length;i++){
                str += score[attempt][i] + " ";
            }
            str += "\nDifficulty Rating : " + this.difficulty[attempt] +"\n"; 
        }
        str += "Final Score : " + getFinal();
        return str;
    }
}
