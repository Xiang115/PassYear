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
import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Q3 {

    public static void main(String[] args) {
        Random r = new Random();
        final int MAX = 122;
        char[] character = new char[6];
        String line;
        try {
            PrintWriter output = new PrintWriter(new FileOutputStream("data.txt"));

            for (int i = 0; i < character.length; i++) {
                character[i] = (char) r.nextInt(MAX + 1);
                while (!(Character.isLetter(character[i]))) {
                    character[i] = (char) r.nextInt(MAX + 1);
                }
                output.print(character[i]);
            }
            output.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

        try {
            BufferedReader input = new BufferedReader(new FileReader("data.txt"));
            line = input.readLine();
            input.close();

            System.out.println("The String generated is: " + line);
            System.out.printf("String sorted in ascending order: %s\n", String.valueOf(sorting(character, ">")));
            System.out.printf("String sorted in descending order: %s\n", String.valueOf(sorting(character, "<")));
            System.out.println("Original stirng form file: " + line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException ex) {
            Logger.getLogger(Q3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static char[] sorting(char[] character, String symbol) {
        if (symbol.equals(">")) {
            char[] a = character.clone();
            for (int pass = 1; pass < character.length; pass++) {
                for (int i = 0; i < character.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        char temp = (char) a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }
            return a;
        } else if (symbol.equals("<")) {
            char[] a = character.clone();
            for (int pass = 1; pass < character.length; pass++) {
                for (int i = 0; i < character.length - 1; i++) {
                    if (a[i] < a[i + 1]) {
                        char temp = (char) a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }
            return a;
        }
        return null;
    }
}
