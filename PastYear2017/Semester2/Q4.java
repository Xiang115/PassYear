/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */
import java.util.*;
import java.io.*;
import java.io.EOFException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Q4 {

    public static void main(String[] args) {
        ArrayList<DayOfTheWeek> day = new ArrayList<>();
        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Q4.dat"));
            try {
                while (true) {
                    String temp = input.readUTF();
                    int q = Integer.parseInt(temp.substring(0, 2));
                    int m = Integer.parseInt(temp.substring(2, 4));
                    int y = Integer.parseInt(temp.substring(4));
                    day.add(new DayOfTheWeek(q, m, y));
                }
            } catch (EOFException e) {
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException ex) {
            System.out.println("Error with input");
        }

        for(DayOfTheWeek days : day){
            System.out.println(days);
        }
    }
}
