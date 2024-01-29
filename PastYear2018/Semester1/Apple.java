/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2018_Q5;

/**
 *
 * @author HP
 */
public class Apple extends Fruit{
    private int quantity;
    
    public Apple(String name,String type,int quantity){
        super(name,type);
        this.quantity=quantity;
    }
    
    @Override
    public double totalPrice(){
        if(type.equalsIgnoreCase("green")){
            return 1.20*quantity;
        }
        else
            return 1.80*quantity;
    }
    
    public String toString(){
        return super.toString()+quantity+" = RM "+totalPrice();
    }
}
