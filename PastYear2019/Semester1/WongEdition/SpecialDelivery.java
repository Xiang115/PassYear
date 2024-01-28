/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2019_Q5;

/**
 *
 * @author HP
 */
public class SpecialDelivery extends Delivery{
    protected boolean weekend;
    protected boolean nighttime;
    
    public SpecialDelivery(String sender,String recipient, double weight, boolean weekd,boolean night){
        super(sender,recipient,weight);
        weekend=weekd;
        nighttime=night;
    }
    
    public double totalCost(){
        if(weekend && nighttime){
            return (super.totalCost(weight)+50)*1.20;
        }
        else if(weekend){
            return super.totalCost(weight)+50;
        }
        else if(nighttime){
            return super.totalCost(weight)*1.20;
        }
        else
            return super.totalCost(weight);
    }
    
    @Override
    public String toString(){
        String result="";
        result+=String.format("From : %s To : %s\nWeight of Package : %.1f kg\nShipping Cost : RM%.2f\n", sender,recipient,
                weight,totalCost());
        if(weekend){
            result+=("Weekend Delivery\n");
        }
        if(nighttime){
            result+=("Night Time Delivery\n");
        }
        return result;
    }
}
