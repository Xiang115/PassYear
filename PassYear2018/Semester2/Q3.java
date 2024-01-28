/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2018_2;

/**
 *
 * @author Goh
 */
import java.io.*;
import java.util.*;

public class Q3 {

    static int Absent = 0;
    static String high, low;
    static double highMark, lowMark;

    public static void main(String[] args) {
        String[] names = new String[10];
        double[] marks = new double[10];

        try {
            Scanner input = new Scanner(new FileInputStream("student.txt"));
            int i = 0;
            while (input.hasNextLine()) {
                String[] object = input.nextLine().split(",");
                names[i] = object[0];
                marks[i] = Double.parseDouble(object[1]);
                if (marks[i] == -1) {
                    Absent++;
                }
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        high = names[0];
        highMark = marks[0];
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] != -1) {

                if (highMark < marks[i]) {
                    high = names[i];
                    highMark = marks[i];
                }
            }
        }

        low = names[0];
        lowMark = marks[0];
        for (int i = 0; i < marks.length; i++) {

            if (marks[i] != -1) {
                if (lowMark > marks[i]) {
                    low = names[i];
                    lowMark = marks[i];
                }
            }
        }

        System.out.printf("The student with the highest mark : %s %.0f\n", high, highMark);
        System.out.printf("The student with the lowest mark : %s %.0f\n", low, lowMark);
        System.out.printf("The number of studdents who were absent from the exam : %d\n", Absent);
    }
}
