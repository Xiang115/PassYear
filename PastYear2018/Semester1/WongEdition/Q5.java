/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2018_Q5;

/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        Apple red=new Apple("Apple","Red",8);
        Apple green=new Apple("Apple","Green",11);
        Watermelon local=new Watermelon("Watermelon","Local",7.6);
        Watermelon imported=new Watermelon("Watermelon","Imported",4);
        
        System.out.println(red);
        System.out.println(green);
        System.out.println(local);
        System.out.println(imported);
        
        System.out.println("The cheapest item is");
        double cheapest=100;
        if(red.totalPrice()<cheapest)
            cheapest=red.totalPrice();
        if(green.totalPrice()<cheapest)
            cheapest=green.totalPrice();
        if(local.totalPrice()<cheapest)
            cheapest=local.totalPrice();
        if(imported.totalPrice()<cheapest)
            cheapest=local.totalPrice();
        if(red.totalPrice()==cheapest)
            System.out.println(red);
        else if(green.totalPrice()==cheapest)
            System.out.println(green);
        else if(local.totalPrice()==cheapest)
            System.out.println(local);
        else
            System.out.println(imported);
    }
}
