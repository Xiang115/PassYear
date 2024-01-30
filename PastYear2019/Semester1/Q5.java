/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pastyear_2019_1;

/**
 *
 * @author Goh
 */
public class Q5 {
    public static void main(String[] args) {
        SpecialDelivery order1 = new SpecialDelivery("Ali","Ahmad",4.4,false,false);
        SpecialDelivery order2 = new SpecialDelivery("Ah Chong","Fatimah",63.1,false,false);
        SpecialDelivery order3 = new SpecialDelivery("FSKTM","FK, UM",32.5,true,false);
        SpecialDelivery order4 = new SpecialDelivery("Ang","Liew",19.0,true,true);
        
        SpecialDelivery[] orders = {order1,order2,order3,order4};
        double Total = 0;
        for(SpecialDelivery order : orders){
            Total += order.totalCost();
            System.out.println(order);
        }
        System.out.printf("The total shipping cose is RM %.2f\n",Total);
    }
}
