/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2019_Q5;

public class Delivery {
    protected String sender;
    protected String recipient;
    protected double weight;
    
    public Delivery(String sender,String recipient,double weight){
        this.sender=sender;
        this.recipient=recipient;
        this.weight=weight;
    }
    
    protected double totalCost(double weight){
        if(weight<=5){
            return 2.80*weight;
        }
        else if(weight>5 && weight<=20){
            return (2.80*5)+5.20*(weight-5);
        }
        else if(weight>20 && weight<=50){
            return (2.80*5)+5.20*15+7.00*(weight-20);
        }
        else if(weight>50){
            return (2.80*5)+5.20*15+7.00*30+8.60*(weight-50);
        }
        else
            return 0;
    }
    
    @Override
    public String toString(){
        return String.format("From : %s To : %s\nWeight of Package : %.1f kg\nShipping Cost : RM%.2f\n", sender,recipient,
                weight,totalCost(weight));
    }
}
