/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2020_Q5;

/**
 *
 * @author HP
 */
public class Cloud {
    protected String Cloudpackage;
    protected double TotalCost;
    
    protected double getTotalCost(){
        return TotalCost;
    }
    
    public Cloud(String Cloudpackage, double TotalCost){
        this.Cloudpackage=Cloudpackage;
        this.TotalCost=TotalCost;
    }
    
    @Override
    public String toString(){
        return "Cloud package: "+Cloudpackage+" Total cost= "+TotalCost;
    }
}
