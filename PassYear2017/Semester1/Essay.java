/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_1;

/**
 *
 * @author Goh
 */
public class Essay extends GradedActivity {

    private int Grammar;
    private int Spelling;
    private int Length;
    private int Content;

    public Essay(int a, int b, int c, int d) {
        this.Grammar = a;
        this.Spelling = b;
        this.Length = c;
        this.Content = d;
    }

    @Override
    public String toString() {
        return String.format("Grammar: %d\n"
                + "Spelling: %d\n"
                + "Length: %d\n"
                + "Content: %d\n", Grammar, Spelling, Length, Content);
    }
}
