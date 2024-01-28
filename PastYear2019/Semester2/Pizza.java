/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_2;

/**
 *
 * @author Goh
 */
public class Pizza {

    private String size;
    private int numOfCheeseTopping;
    private int numOfBeefTopping;
    private int numOfChickenTopping;

    public Pizza(String a, int b, int c, int d) {
        this.size = a;
        this.numOfCheeseTopping = b;
        this.numOfBeefTopping = c;
        this.numOfChickenTopping = d;
    }

    public String getSize() {
        return size;
    }

    public int getNumOfCheeseTopping() {
        return numOfCheeseTopping;
    }

    public int getNumOfBeefTopping() {
        return numOfBeefTopping;
    }

    public int getNumOfChickenTopping() {
        return numOfChickenTopping;
    }

    public void setSize(String a) {
        this.size = a;
    }

    public void setNumOfCheeseTopping(int b) {
        this.numOfCheeseTopping = b;
    }

    public void setNumOfBeefTopping(int c) {
        this.numOfBeefTopping = c;
    }

    public void setNumOfChickenTopping(int d) {
        this.numOfChickenTopping = d;
    }

    public double computeCost() {
        switch (size) {
            case "Small":
                return 10 + 2 * (numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping);
            case "Medium":
                return 12 + 2 * (numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping);
            default:
                return 14 + 2 * (numOfCheeseTopping + numOfBeefTopping + numOfChickenTopping);
        }
    }

    public void Display() {
        System.out.println("Pizza size: " + size);
        System.out.println("Number of Cheese Topping: " + numOfCheeseTopping);
        System.out.println("Number of Beef Topping: " + numOfBeefTopping);
        System.out.println("Number of Chicken Topping: " + numOfChickenTopping);
        System.out.println("Cost: $ " + computeCost());
    }
}
