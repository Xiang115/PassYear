/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2018_2;

/**
 *
 * @author Goh
 */
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G, S, L, C;
        System.out.print("Enter the marks for Grammar(maximum 30 marks): ");
        G = sc.nextInt();
        System.out.print("Enter the marks for Spelling(maximum 20 marks): ");
        S = sc.nextInt();
        System.out.print("Enter the marks for Length(maximum 20 marks): ");
        L = sc.nextInt();
        System.out.print("Enter the marks for Content(maximum 30 marks): ");
        C = sc.nextInt();
        Essay r1 = new Essay(G,S,L,C);
        
        System.out.println("\nEssay score:");
        System.out.println(r1);
        
        int total = G + S + L +C;
        r1.setScore(total);
        System.out.println("\nTotal score: " + total);
        System.out.println("Essay grade: " + r1.getGrade());
    }
}
