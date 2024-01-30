/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_1;

/**
 *
 * @author Goh
 */
public class Delivery {
    private String sender;
    private String recipient;
    private double weight;
    
    public Delivery(String a, String b, double c){
        this.sender = a;
        this.recipient = b;
        this.weight = c;
    }
    
    public double totalCost(){
        if(weight<=5){
            return 2.8*weight;
        }else if(weight<=20){
            return 2.8*5 + 5.2*(weight-5);
        }else if(weight<=50){
            return 2.8*5 + 5.2*15 + 7*(weight-20);
        }else{
            return 2.8*5 + 5.2*15 + 7*30 + 8.6*(weight-50);
        }
    }
    
    @Override
    public String toString(){
        return String.format("From : %s To : %s\n"
                + "Weight of Package : %.1f kg\n"
                + "Shipping Cost : RM%.2f\n",this.sender,
                this.recipient,this.weight,totalCost());
    }
}
