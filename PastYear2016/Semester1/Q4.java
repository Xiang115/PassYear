/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_1;

/**
 *
 * @author Goh
 */
import java.util.*;
import java.io.*;

public class Q4 {

    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new FileReader("Q4.txt"));
            String object;
            while ((object = input.readLine()) != null) {
                if (isStrongPassword(object)) {
                    System.out.println("Strong password");
                } else {
                    System.out.println("Not a Strong password");
                }

            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    public static boolean isStrongPassword(String a) {
        boolean b1 = false, b2 = false, b3 = false, b4 = false, b5 = false;
        if (a.length() >= 8) {
            b1 = true;
        }
        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if(Character.isLetter(x)){
                if (a.charAt(i) >= 'A' || a.charAt(i) <= 'Z') {
                    b2 = true;
                    break;
                }
            }
        }

        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if(Character.isLetter(x)){
                if (a.charAt(i) >= 'a' || a.charAt(i) <= 'z') {
                    b3 = true;
                    break;
                }
            }
        }

        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if (Character.isDigit(x)) {
                b4 = true;
                break;
            }
        }

        for (int i = 0; i < a.length(); i++) {
            char x = a.charAt(i);
            if (!(Character.isDigit(x) || Character.isLetter(x))) {
                b5 = true;
                break;
            }
        }
        return b1 && b2 && b3 && b4 && b5;
    }
}
