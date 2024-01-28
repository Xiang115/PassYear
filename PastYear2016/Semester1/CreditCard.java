/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_1;

/**
 *
 * @author Goh
 */
public class CreditCard {
    private String name;
    private String CardNum;
    private String CardType;
    protected double TotalCashReward;
    
    public CreditCard(String a,String b, String c){
        this.name = a;
        this.CardNum = b;
        this.CardType = c;
    }
    
    public double getTotalCashReward(){
        return this.TotalCashReward;
    }
 
    public void setTotalCashReward(int a){
        this.TotalCashReward = a;
    }
    
    @Override
    public String toString(){
        String str = "Credit Card : " + this.name + "(" + this.CardNum + ")\n" ;
        str+= "Card Type : " + this.CardType +"\n";
        str+= "Total Cash Reward : " + this.TotalCashReward;
        return str;
    }
}
