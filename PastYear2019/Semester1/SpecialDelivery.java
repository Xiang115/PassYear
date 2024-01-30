/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_1;

/**
 *
 * @author Goh
 */
public class SpecialDelivery extends Delivery {

    private boolean Weekend;
    private boolean Night;

    public SpecialDelivery(String a, String b, double c, boolean d, boolean e) {
        super(a, b, c);
        Weekend = d;
        Night = e;
    }

    @Override
    public double totalCost() {
        if(Weekend  && Night){
            return (super.totalCost()+50)*1.2; 
        }
        if (Weekend) {
            return super.totalCost() + 50;
        }
        if (Night) {
            return super.totalCost() * 1.2;
        } 
        else {
            return super.totalCost();
        }
    }

    @Override
    public String toString() {
        if (Weekend) {
            return super.toString()+"Weekend Delivery\n";
        }
        if (Night) {
            return super.toString() + "Night Time Delivery\n";
        } else {
            return super.toString();
        }
    }
}
