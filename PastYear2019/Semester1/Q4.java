/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_1;

/**
 *
 * @author Goh
 */
import java.io.*;
import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        String[] line;
        try {
            Scanner sc = new Scanner(new FileInputStream("myAmbition.txt"));

            int size = 0;
            while (sc.hasNextLine()) {
                size++;
                sc.nextLine();
            }
            sc.close();

            line = new String[size];
            sc = new Scanner(new FileInputStream("myAmbition.txt"));
            for (int i = 0; i < line.length; i++) {
                line[i] = sc.nextLine();
            }
            sc.close();

            System.out.println("The essay is : ");
            for (int i = 0; i < line.length; i++) {
                System.out.println(line[i]);
            }
            System.out.println("");

            CountNumberOfSentence(line);
            CountNumberOfWords(line);
            CountNumberOfLetter(line);

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }

    public static void CountNumberOfSentence(String[] line) {
        int sentence = 0;
        for (String lines : line) {
            if (lines.contains(".")) {
                sentence++;
            }
        }
        System.out.println("Number of sentences : " + sentence);
    }

    public static void CountNumberOfWords(String[] line) {
        int word = 0;
        for (String lines : line) {
            String[] str = lines.split(" ");
            word += str.length;
        }
        System.out.println("Number of words : " + word);
    }

    public static void CountNumberOfLetter(String[] line) {
        int[] letters = new int[26];
        for (int i = 0; i < line.length; i++) {
            String lines = line[i].toLowerCase();
            for (int j = 0; j < lines.length(); j++) {
                char letter = lines.charAt(j);
                if (Character.isLetter(letter)) {
                    int z = (int) letter - 'a';
                    letters[z]++;
                }
            }
        }

        for (int i = 0; i < letters.length;) {
            if (i < 24) {
                for (int j = 0; j < 8; j++) {
                    System.out.printf("%c : %d ", (char) ('A' + i), letters[i]);
                    i++;
                }
                System.out.println("");
            } else {
                System.out.printf("%c : %d ", (char) ('A' + i), letters[i]);
                i++;
            }
        }
        System.out.println("");
    }
}
