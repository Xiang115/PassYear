/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2018_Q5;

/**
 *
 * @author HP
 */
public class Watermelon extends Fruit{
    private double weight;
    
    public Watermelon(String name,String type,double weight){
        super(name,type);
        this.weight=weight;
    }
    
    @Override
    public double totalPrice(){
        if(type.equalsIgnoreCase("local")){
            if(weight<2)
                return 2.25*weight;
            else if(weight>2 && weight<=5)
                return 1.95*weight;
            else 
                return 1.65*weight;
        }
        else if(type.equalsIgnoreCase("imported")){
            if(weight<2)
                return 3.75*weight;
            else if(weight>2 && weight<=5)
                return 3.45*weight;
            else
                return 3.15*weight;
        }
        else
            return 0;
    }
    
    public String toString(){
        return super.toString()+weight+"kg"+" = RM "+totalPrice();
    }
}
