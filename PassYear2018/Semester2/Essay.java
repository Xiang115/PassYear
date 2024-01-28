/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2018_2;

/**
 *
 * @author Goh
 */
public class Essay extends GradedActivity{
    private int G,S,L,C;
    
    public Essay(int a, int b, int c, int d){
        this.G = a;
        this.S = b;
        this.L = c;
        this.C = d;
    }
    
    @Override
    public String toString(){
        return String.format("Grammar: %d\n"
                + "Spelling: %d\n"
                + "Lenght: %d\n"
                + "Content: %d", G,S,L,C);
    }
}
