/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_1;

/**
 *
 * @author Goh
 */
public class Q5 {
    public static void main(String[] args) {
        Rebate r = new Rebate("John Lim","1111222233334444");
        Point p = new Point("John Lim","5555666677778888999");
        String[] type = {"Grocery","Other","Fuel","Utility","Other"};
        String[] Day = {"Saturday","Friday","Sunday","Friday","Tuesday"};
        double[] total = {124.80,64.6,95.4,100,220};
        r.getReward(type, total);
        p.getReward(Day, total);
        System.out.println(r);
        System.out.println(p);
        if(r.getTotalCashReward()>p.getTotalCashReward()){
            System.out.println("The best card is Cash Rebate card");
        }else{
            System.out.println("The best card is Point Reward card");
        }
    }
}
