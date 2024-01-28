/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */
public class ShippedOrder extends Order {

    public ShippedOrder(String a, String b, int c, int d) {
        super(a, b, c, d);
    }

    @Override
    public double computeTotalPrice() {
        return getQuantity() * getunitPrice() + 4;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
