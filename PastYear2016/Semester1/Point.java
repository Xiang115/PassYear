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

public class Point extends CreditCard {

    Map<String, Integer> map = Map.of(
            "Friday", 2,
            "Saturday", 3,
            "Sunday", 4);

    public Point(String a, String b) {
        super(a, b, "Point Reward");
    }

    public void getReward(String[] a, double[] total) {
        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(a[i])) {
                TotalCashReward += ((int) total[i]* map.get(a[i])) * 0.01;
            } else {
                TotalCashReward += (int) total[i] * 0.01;
            }
        }
    }
}
