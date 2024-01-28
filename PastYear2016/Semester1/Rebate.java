/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package passyear_2016_1;

/**
 *
 * @author Goh
 */
import java.util.*;

public class Rebate extends CreditCard{
    Map<String, Double> map = Map.of(
    "Fuel",0.08,
    "Utility",0.05,
    "Grocery",0.02,
    "Other",0.002);
    
    public Rebate(String a,String b){
        super(a,b,"Cash Rebate");
    }
    
    public void getReward(String[] a,double[] total){
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                TotalCashReward+=total[i]*map.get(a[i]);
            }
        }
    }
}
