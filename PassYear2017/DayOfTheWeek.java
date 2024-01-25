/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2017_2;

/**
 *
 * @author Goh
 */
public class DayOfTheWeek {

    private int q;
    private int m;
    private int y;
    private int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private String[] DayWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

    public DayOfTheWeek(int q, int m, int y) {
        this.q = q;
        this.m = m;
        this.y = y;
    }

    public boolean isLeapYear() {
        boolean isLeapYear = false;
        if ((y % 4 == 0) && (y % 100 != 0)) {
            return true;
        }
        if (y % 400 == 0) {
            return true;
        }
        return isLeapYear;
    }

    public boolean isValidDate() {
        if (m != 2) {
            return q >= 1 && q <= month[m];
        } else {
            if (isLeapYear()) {
                return q >= 1 && q <= (month[m] + 1);
            } else {
                return q >= 1 && q <= month[m];
            }
        }
    }

    @Override
    public String toString() {
        int OriY = y;
        int OriM = m;
        if (isValidDate()) {
            if (m == 1 || m == 2) {
                y -= 1;
                if (m == 1) {
                    m = 13;
                } else {
                    m = 14;
                }
            }
            int j = y/100;
            int k = y%100;
            int h = (int) ((q + Math.floor((13 * (m + 1)) / 5) + k + Math.floor(k / 4) + Math.floor(j / 4) + 5 * j) % 7);
            return String.format("%d/%d/%d is on %s", q, OriM, OriY, DayWeek[h]);
        } else {
            return String.format("%d/%d/%d is invalid input", q, m, y);
        }
    }
}
