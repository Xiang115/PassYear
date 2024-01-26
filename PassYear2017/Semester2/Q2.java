/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */
import java.util.Arrays;
import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of teams: ");
        int size = sc.nextInt();
        Team[] teams = new Team[size];
        
        for(int i=0;i<size;i++){
            System.out.print("Enter team "+ (i+1)+ " name: ");
            String name = sc.next();
            System.out.print("Enter team "+ (i+1) +" score: ");
            int score = sc.nextInt();
            teams[i] = new Team(name,score);
        }
        
        Arrays.sort(teams);
        System.out.println("List of team with the highest team score first");
        for(Team team : teams){
            System.out.print(team +" | ");
        }
    }
}
