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

        Job[] jobs = {J1, J2, J3};
        CloudPackage[] packages = {P215, P230, R520, R620};

        double Total = 0;
        for (Job job : jobs) {
            CloudPackage cheap = new CloudPackage("1", 1, 1, 200000);
            for (CloudPackage list : packages) {
                if (list.check(job) && cheap.totalCost(job) > list.totalCost(job)) {
                    cheap = list;
                }
            }
            Total += cheap.getTotal();
            System.out.println(job);
            System.out.println(cheap);
        }
        System.out.println("Total Cost: " + Total);
    }
}
