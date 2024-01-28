/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2018_2;

/**
 *
 * @author Goh
 */
public class LinearEquation {

    private int a, b, c, d, e, f;

    public LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public int computeX() {
        int up = e * d - b * f;
        int down = a * d - b * c;
        return up / down;
    }

    public int computeY() {
        int up = a * f - e * c;
        int down = a * d - b * c;
        return up / down;
    }

    @Override
    public String toString() {
        return String.format("%dx + %dy = %d\n"
                + "%dx + %dy = %d", a, b, e, c, d, f);
    }
}
