/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_1;

/**
 *
 * @author Goh
 */

import java.util.*;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score1,score2,score3,score4;
        
        System.out.print("Enter the marks for Grammar (maximum 30 marks): ");
        score1 = sc.nextInt();
        System.out.print("Enter the marks for Spelling(maximum 20 marks): ");
        score2 = sc.nextInt();
        System.out.print("Enter the marks for Length (maximum 20 marks): ");
        score3 = sc.nextInt();
        System.out.print("Enter the marks for Content (maximum 30 marks): ");
        score4 = sc.nextInt();
        Essay s1 = new Essay(score1,score2,score3,score4);
        System.out.println("\nEssay score:");
        System.out.println(s1);
        
        int Total = score1+score2+score3+score4;
        s1.setScore(Total);
        
        System.out.printf("Total score: %d\n",s1.getScore());
        System.out.printf("Total grade: %c\n",s1.getGrade());
    }
}
