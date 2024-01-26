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

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d;
        System.out.print("First complex number.");
        System.out.print("Enter a number for the real part: ");
        a = sc.nextInt();
        System.out.print("First complex number.");
        System.out.print("Enter a number for the imaginary part: ");
        b = sc.nextInt();
        Complex s1 = new Complex(a,b);
        System.out.print("Second complex number.");
        System.out.print("Enter a number for the real part: ");
        c = sc.nextInt();
        System.out.print("Second complex number.");
        System.out.print("Enter a number for the imaginary part: ");
        d = sc.nextInt();
        Complex s2 = new Complex(c,d);
        System.out.println("");

        System.out.printf("First complex number: %s\n",s1);
        System.out.printf("Second complex number: %s\n",s1);
        System.out.print("Addition  of the two complex numbers: ");
        s1.addComplexNum(s2);
        System.out.print("Subtraction of the two complex numbers: ");
        s1.SubtractComplexNum(s2); 
    }
}
