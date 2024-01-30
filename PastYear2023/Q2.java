/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2023_1;

/**
 *
 * @author Goh
 */
import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] marks;
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();
        while (!DisplayOutBound(size)) {
            System.out.println("Error");
            System.out.print("Enter the number of students: ");
            size = sc.nextInt();
        }
        marks = new int[size][];

        for (int i = 0; i < size;i++) {
            System.out.printf("Enter the number of subjects for student %d: ", i + 1);
            int Question = sc.nextInt();
            if (DisplayOutBound(Question)) {
                marks[i] = new int[Question];
                for (int j = 0; j < Question;) {
                    System.out.printf("Student (%d) Enter mark for Subject %d: ", (j + 1), (j + 1));
                    int mark = sc.nextInt();
                    if (!DisplayOutBound(mark)) {
                        System.out.println("Error!!!");
                        continue;
                    }
                    marks[i][j] = mark;
                    j++;
                }
            } else {
                System.out.println("Error");
            }
        }
        System.out.printf("List of Student (%d students)\n", size);
        
        double[] average = new double[size];
        for(int i=0;i<marks.length;i++){
            System.out.printf("Student &d",i+1);
            for(int j=0;j<marks[i].length;j++){
                System.out.printf("Subject %d:%d\n",j+1,marks[i][j]);
            }
            System.out.printf("Average Marks: %.2f\n",calcAverage(marks[i]));
            average[i] = calcAverage(marks[i]);
        }
        
        int HighIndex=0;
        for(int i=0;i<average.length;i++){
            HighIndex=0;
            if(average[HighIndex]<average[i]){
                HighIndex = i;
            }
        }
        System.out.printf("Student %d has the highest average, with %.2f marks\n",HighIndex+1,average[HighIndex]);
    }

    public static boolean DisplayOutBound(int a) {
        return a > 0 && a <= 100;
    }
    
    public static double calcAverage(int[]a){
        double sum = 0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
}
