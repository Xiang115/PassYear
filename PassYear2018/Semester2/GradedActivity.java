/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2018_2;

/**
 *
 * @author Goh
 */
public class GradedActivity {
    private int totalscore;
        
    public void setScore(int score){
        this.totalscore = score;
    }
    
    public int getScore(){
        return totalscore;
    }
    
    public char getGrade(){
        if(totalscore >= 90)
            return 'A';
        else if(totalscore >= 80)
            return 'B';
        else if(totalscore >= 70)
            return 'C';
        else if(totalscore >= 60)
            return 'D';
        return 'F';
    }
    
    @Override
    public String toString(){
        return String.format("Total score: %d\n"
                + "Essay grade: %c\n",totalscore,getGrade());
    }
}
