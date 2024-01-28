/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */
public class Order {

    private String CustomerName, CustomerID;
    private int Quantity;
    private double unitPrice;

    public Order() {
        this.CustomerName = null;
        this.CustomerID = null;
        this.Quantity = 0;
        this.unitPrice = 0;
    }

    public Order(String a, String b, int c, double d) {
        this.CustomerName = a;
        this.CustomerID = b;
        this.Quantity = c;
        this.unitPrice = d;
    }

    public String getCustomerName() {
        return this.CustomerName;
    }

    public void setCustomerName(String a) {
        this.CustomerName = a;
    }

    public String getCustomerID() {
        return this.CustomerID;
    }

    public void setCustomerID(String b) {
        this.CustomerID = b;
    }

    public int getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(int c) {
        this.Quantity = c;
    }

    public double getunitPrice() {
        return this.unitPrice;
    }

    public void setunitPrice(double d) {
        this.unitPrice = d;
    }

    public double computeTotalPrice() {
        return Quantity * unitPrice;
    }

    @Override
    public String toString() {
        return String.format("Customer Name: %s\n"
                + "Customer ID: %s\n"
                + "Quantity; %d\n"
                + "Unit Price: %.1f\n"
                + "Total Price: %.1f\n", this.CustomerID, this.CustomerID,
                this.Quantity, this.unitPrice, computeTotalPrice());
    }
}
