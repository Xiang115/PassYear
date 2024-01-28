/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */
public class Team implements Comparable<Team>{
    private String name;
    private int score;
    
    public Team(String name, int score){
        this.name = name;
        this.score = score;
    }
    
    @Override
    public int compareTo(Team another){
        return -1*Integer.compare(this.score, another.score);
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(){
        return score;
    }
    
    @Override
    public String toString(){
        return getName()+" (" + getScore() + ")";
    }
}
