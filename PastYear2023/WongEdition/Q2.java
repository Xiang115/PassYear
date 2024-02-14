/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PastYear2023.WongEdition;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numofstudents;
        do{
            System.out.print("Enter the number of students: ");
            numofstudents=sc.nextInt();
        }while(withintherange(0,numofstudents,10));
        
        int counter1=0,counter2=0;
        int[][] marks=new int[numofstudents][];
        for(int i=0;i<numofstudents;i++){
            marks[i]=new int[numofstudents];            
            int numofsubjects=0;
            counter1++;
            do{
                System.out.print("Enter the number of subjects for student "+counter1+": ");
                numofsubjects=sc.nextInt();
            }while(withintherange(0,numofsubjects,10));
            
            marks[i]=new int[numofsubjects];
            for(int j=0;j<numofsubjects;j++){
                counter2++;
                do{
                System.out.print("Student ("+counter1+") Enter mark for Subject "+counter2+": ");
                marks[i][j]=sc.nextInt();
                }while(withintherange(0,marks[i][j],100));
            }
            counter2=0;
        }
        
        counter1=1;
        int totalmarks=0,averagemark=0;
        System.out.println("List of Students ("+numofstudents+" students)");
        int highest=0,higheststudent=0;
        for(int i=0;i<marks.length;i++){
            counter2=1;
            System.out.println("Student "+counter1);
            for(int j=0;j<marks[i].length;j++){
                System.out.print("Subject "+counter2+": ");
                System.out.println(marks[i][j]);
                totalmarks+=marks[i][j];
                counter2++;
            }
            System.out.print("Average Marks: ");
            averagemark=totalmarks/(counter2-1);
            if(averagemark>highest){
                highest=averagemark;
                higheststudent=counter1;
            }
            System.out.println(averagemark);
            counter1++;
            counter2=1;
            totalmarks=0;
        }
        
        System.out.println("Student "+higheststudent+" has the highest average, with "+highest+" marks");
    }
    
    private static boolean withintherange(int min, int a, int max){
        if(a<min||a>max){
            System.out.println("Error!!!");
            return true;
        }
        return false;
    }
}
