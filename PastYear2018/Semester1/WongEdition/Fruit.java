/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2018_Q5;

/**
 *
 * @author HP
 */
public abstract class Fruit {
    protected String name;
    protected String type;
    
    public Fruit(String name,String type){
        this.name=name;
        this.type=type;
    }
    
    public abstract double totalPrice();
    
    @Override
    public String toString(){
        return type+" "+name+" - ";
    }
}
