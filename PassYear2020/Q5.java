/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2020_1;

/**
 *
 * @author Goh
 */
public class Q5 {

    public static void main(String[] args) {
        Job J1 = new Job("J1", 252, 20);
        Job J2 = new Job("J2", 108, 10);
        Job J3 = new Job("J3", 72, 25);
        CloudPackage P215 = new CloudPackage("P2-15", 4, 15, 1.24);
        CloudPackage P230 = new CloudPackage("P2-30", 6, 30, 2.11);
        CloudPackage R520 = new CloudPackage("R5-20", 4, 20, 1.38);
        CloudPackage R620 = new CloudPackage("R6-20", 6, 20, 1.88);

        System.out.println(J1);
        if (R620.check(J1)) {
            R620.totalCost(J1);
            System.out.println(R620);
        }

        System.out.println(J2);
        if (P215.check(J2)) {
            P215.totalCost(J2);
            System.out.println(P215);
        }
        
        System.out.println(J3);
        if (P230.check(J3)) {
            P230.totalCost(J3);
            System.out.println(P230);
        }
        
        double Total = R620.Total + P215.Total + P230.Total;
        System.out.println("Total Cost: " + Total);
    }
}
