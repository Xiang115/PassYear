/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PYQ2019_Q5;

/**
 *
 * @author HP
 */
public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery Ali=new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        SpecialDelivery Chong=new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        SpecialDelivery FSKTM=new SpecialDelivery("FSKTM,UM","FK,UM",32.5,true,false);
        SpecialDelivery Ang=new SpecialDelivery("Ang","Liew",19.0,true,true);
        System.out.println(Ali);
        System.out.println(Chong);
        System.out.println(FSKTM);
        System.out.println(Ang);
        
        System.out.println("The total shipping cost is RM "+(Ali.totalCost()+Chong.totalCost()+
                FSKTM.totalCost()+Ang.totalCost()));
    }
}
