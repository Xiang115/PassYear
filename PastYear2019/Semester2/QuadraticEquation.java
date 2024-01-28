/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */
public class QuadraticEquation {

    private int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int Discriminant() {
        return b * b - 4 * a * c;
    }

    public int calcRoot1() {
        return (int)(-1 * b + (Math.sqrt(Discriminant()))) / 2 * a;
    }

    public int calcRoot2() {
        return (int)(-1 * b - (Math.sqrt(Discriminant()))) / 2 * a;
    }
}
