/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2022_Q2;

public class Diving {
    private String name;
    private String country;
    private double[][] scores=new double[3][7];
    private double[] difficulty=new double[3];
    
    public Diving(String name,String country,double[][] scores,double[] difficulty){
        this.name=name;
        this.country=country;
        this.scores=scores;
        this.difficulty=difficulty;
    }
    
    protected String getName(){
        return name;
    }
    
    protected String getCountry(){
        return country;
    }
    
    protected double FinalScore(){
        double total=0;
        for(int i=0;i<scores.length;i++){    
            for(int pass=1;pass<scores[i].length;pass++){
                for(int a=0;a<scores[i].length-1;a++){
                    if(scores[i][a]>scores[i][a+1]){
                        double temp=scores[i][a];
                        scores[i][a]=scores[i][a+1];
                        scores[i][a+1]=temp;
                    }
                }
            }    
        }
        
        for(int i=0;i<scores.length;i++){
            double finals=0;
            for(int j=2;j<scores[i].length-2;j++)
                finals+=scores[i][j];
            finals*=difficulty[i];
            total+=finals;
        }
        return total;
    }
    
    @Override
    public String toString(){
        String stats="";
        for(int i=0;i<scores.length;i++){
            stats+="Judges scores : ";
            for(int j=0;j<scores[i].length;j++)
                stats+=scores[i][j]+" ";
            stats+="\nDifficulty rating : "+difficulty[i]+"\n";
        }
        return String.format("Diver : %s (%s)\n"
                +"%s"
                +"Final score : %.1f", name,country,stats,FinalScore());
    }
}
